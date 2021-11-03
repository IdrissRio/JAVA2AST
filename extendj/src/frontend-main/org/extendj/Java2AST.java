/* Copyright (c) 2021, Idriss Riouak <idriss.riouak@cs.lth.se>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.extendj;

import CLI.src.Format;
import CLI.src.Table;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;
import lund.Property;
import org.extendj.JavaChecker;
import org.extendj.ast.ASTNode;
import org.extendj.ast.CompilationUnit;
import org.extendj.ast.Frontend;
import org.extendj.ast.Program;
import org.json.*;

/**
 * Given java programs, generates a table containing properties. The output
 * is printed on standard output.
 */
public class Java2AST extends Frontend {

  private static String filename;
  // Collects all the properties provided by the user.
  public static ArrayList<String> userProperties = new ArrayList<String>();
  // Collects all the properties available. These are loaded from
  // 'resources/properties.json'
  public static ArrayList<Property> availableProperties =
      new ArrayList<Property>();
  // Contains the intersection between userProperties and availableProperties.
  public static ArrayList<Property> instanceProperties =
      new ArrayList<Property>();
  public static boolean printHelp = false;
  public static Format genformat = Format.FANCY;
  public static Format readformat = Format.FANCY;

  private String[] setEnv(String[] args) throws FileNotFoundException {
    if (args.length < 1) {
      System.err.println("You must specify a source file on the command line!");
      printOptionsUsage();
    }

    ArrayList<String> FEOptions = new ArrayList<>();

    filename = args[0];
    for (int i = 0; i < args.length; ++i) {
      String opt = args[i];
      if (opt.contains(".java")) {
        FEOptions.add(args[i]);
        continue;
      }
      if (opt.equals("-help")) {
        printHelp = true;
      } else if (opt.startsWith("-property=")) { // Getting all the properties
        opt = opt.substring(10, opt.length());
        String[] properties = opt.split(",");
        userProperties = new ArrayList<String>(Arrays.asList(properties));
        continue;
      } else if (opt.startsWith("-gen=")) {
        opt = opt.substring(5, opt.length());
        switch (opt) {
        case "csv":
          genformat = Format.CSV;
          break;
        case "tab":
          genformat = Format.TAB;
          break;
        case "fancy":
          genformat = Format.FANCY;
          break;

        default:
          System.err.println("error");
          System.exit(1);
          break;
        }
      } else if (opt.startsWith("-read=")) {
        opt = opt.substring(6, opt.length());
        switch (opt) {
        case "csv":
          readformat = Format.CSV;
          break;
        case "tab":
          readformat = Format.TAB;
          break;
        case "fancy":
          readformat = Format.FANCY;
          break;

        default:
          System.err.println("error");
          System.exit(1);
          break;
        }
      } else {
        printHelp = true;
      }
    }
    // Alsways print the source location and the relative path
    if (!userProperties.contains("line_start"))
      userProperties.add("line_start");
    if (!userProperties.contains("line_end"))
      userProperties.add("line_end");
    if (!userProperties.contains("column_start"))
      userProperties.add("column_start");
    if (!userProperties.contains("column_end"))
      userProperties.add("column_end");
    if (!userProperties.contains("rel_path"))
      userProperties.add("rel_path");
    readJSONFile("resources/properties.json"); // Reading a populating the
                                               // availableProperties and
                                               // instanceProperties
    if (printHelp)
      printOptionsUsage();
    if (FEOptions.size() < 1) {
      System.out.println("You must provide at least one Java file");
    }
    return FEOptions.toArray(new String[FEOptions.size()]);
  }

  void readJSONFile(String resourceName) throws FileNotFoundException {
    InputStream is = new FileInputStream(new File(resourceName));
    JSONTokener tokener = new JSONTokener(is);
    JSONObject obj = new JSONObject(tokener);
    JSONArray arr = obj.getJSONArray("properties");
    for (int i = 0; i < arr.length(); ++i) {
      String name = arr.getJSONObject(i).getString("name");
      String command = arr.getJSONObject(i).getString("command");
      String description = arr.getJSONObject(i).getString("description");
      availableProperties.add(new Property(name, command, description));
    }
    for (Property p : availableProperties) {
      if (userProperties.contains(p.getName()) ||
          userProperties.contains(
              "all")) { // Adding all the properties if 'all' is provided
        instanceProperties.add(p);
      }
    }
    if (instanceProperties.size() != userProperties.size() &&
        !userProperties.contains("all")) {
      System.err.println("Some of the properties provided are not available.");
      this.printOptionsUsage();
      throw new RuntimeException("Unrecognized property");
    }
  }

  /**
   * Entry point for the Java checker.
   * @param args command-line arguments
   */
  public static void main(String args[]) throws FileNotFoundException {
    Java2AST SAFE = new Java2AST();
    String[] jCheckerArgs = SAFE.setEnv(args);
    int exitCode = SAFE.run(jCheckerArgs);
    if (exitCode != 0)
      System.exit(exitCode);

    Program program = SAFE.getEntryPoint();
    ArrayList<String> res2 = new ArrayList<String>();
    for (Property p : instanceProperties) {
      res2.add(p.getName().toUpperCase());
    }
    Table table = new Table(res2.toArray(new String[1]), genformat, readformat);
    for (CompilationUnit unit : program.getCompilationUnits())
      printTable(unit, System.out, table);
  }

  static void printTable(CompilationUnit unit, PrintStream out, Table table) {
    for (ASTNode node : unit.allNodes()) {
      ArrayList<String> res = new ArrayList<String>();
      try {
        for (Property p : instanceProperties) {
          String prop =
              node.getClass().getMethod(p.getCommand()).invoke(node).toString();
          res.add(prop);
        }
      } catch (NoSuchMethodException | IllegalAccessException |
               InvocationTargetException | IllegalArgumentException t) {

        t.printStackTrace();
        System.exit(1);
      }
      table.addRow(res.toArray(new String[1]));
    }
    out.println(table);
  }

  /**
   * Initialize the Java checker.
   */
  public Java2AST() { super("JAVA2AST", ExtendJVersion.getVersion()); }

  /**
   * @param args command-line arguments
   * @return {@code true} on success, {@code false} on error
   * @deprecated Use run instead!
   */
  @Deprecated
  public static boolean compile(String args[]) {
    return 0 == new JavaChecker().run(args);
  }

  /**
   * Run the Java checker.
   * @param args command-line arguments
   * @return 0 on success, 1 on error, 2 on configuration error, 3 on system
   */
  public int run(String args[]) {
    return run(args, Program.defaultBytecodeReader(),
               Program.defaultJavaParser());
  }

  /**
   * Called for each from-source compilation unit with no errors.
   */
  protected void processNoErrors(CompilationUnit unit) {}

  @Override
  protected String name() {
    return "Java2AST";
  }

  @Override
  protected String version() {
    return "ProjectCourse2021";
  }

  public Program getEntryPoint() { return program; }

  void printOptionsUsage() {
    System.out.println(name() + " - Version:" + version());
    System.out.println("Authors: Idriss Riouak & Momina Rizwan");
    System.out.println("\n");
    System.out.println("./java2ast [-property=...] *.java");
    System.out.println("\n");
    System.out.println("Available options:");
    System.out.println(
        "  -help: prints the usage and all the available options.\n");
    System.out.println(
        "  -properties:...: prints in the table the selected properties.\n");
    System.out.println(
        "  where '...' can be any of this (use ',' as delimiter):");
    System.out.printf("    %-20.20s  %s \n", "PROPERTY NAME", "DESCRIPTION");
    System.out.printf("    %-20.20s  %s \n", "all",
                      "Prints all the available properties");
    for (Property p : availableProperties) {
      System.out.printf("    %-20.20s  %s \n", p.getName(), p.getDescription());
    }
    System.exit(1);
  }
}
