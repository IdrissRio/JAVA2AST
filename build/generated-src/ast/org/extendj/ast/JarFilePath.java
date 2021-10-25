package org.extendj.ast;

import java.util.*;
import beaver.*;
import java.util.zip.*;
import java.io.*;
import org.jastadd.util.*;
import java.util.LinkedHashSet;
import java.io.PrintStream;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import CLI.src.Table;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.concurrent.ConcurrentMap;
import org.jastadd.util.PrettyPrintable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jastadd.util.PrettyPrinter;
import java.io.BufferedInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
/**
 * A Jar file path listed in the classpath. Can contain many .class files.
 * This PathPart lazily initializes its package set and entry set.
 * @ast class
 * @aspect PathPart
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:510
 */
public class JarFilePath extends PathPart {
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:511
   */
  
    private Collection<String> packageIndex = null;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:512
   */
  
    private final ZipFile jar;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:513
   */
  
    private final String jarPath;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:515
   */
  

    public JarFilePath(String jarPath) throws IOException {
      super(false);
      this.jar = new ZipFile(jarPath);
      this.jarPath = jarPath;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:521
   */
  

    public JarFilePath(File jarFile) throws IOException {
      super(false);
      this.jar = new ZipFile(jarFile);
      this.jarPath = jarFile.getPath();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:527
   */
  

    @Override
    public String getPath() {
      return jarPath;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:532
   */
  

    private static void scanJar(ZipFile jar, Collection<String> packages,
        String fileSuffix) {
      // Add all zip entries to a set so that we can quickly check if the Jar
      // contains a given class.
      for (Enumeration entries = jar.entries(); entries.hasMoreElements(); ) {
        ZipEntry entry = (ZipEntry) entries.nextElement();
        String path = entry.getName();
        if (path.endsWith(fileSuffix)) {
          addPackages(packages, path);
        }
      }
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:545
   */
  

    private static void addPackages(Collection<String> packages, String path) {
      String name = path.replace('/', '.');
      int index = path.length();
      do {
        index = path.lastIndexOf('/', index-1);
      } while (index >= 0 && packages.add(name.substring(0, index)));
    }
  /**
   * Caches the package index from the Jar file so that subsequent calls to
   * this method are quicker.
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:557
   */
  

    /**
     * Caches the package index from the Jar file so that subsequent calls to
     * this method are quicker.
     */
    @Override
    public boolean hasPackage(String name) {
      synchronized (this) {
        if (packageIndex == null) {
          packageIndex = new HashSet<String>();
          scanJar(jar, packageIndex, fileSuffix);
        }
      }
      return packageIndex.contains(name);
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:568
   */
  

    @Override
    public ClassSource findSource(String name) {
      // ZipFiles always use '/' as separator
      String jarName = name.replace('.', '/') + fileSuffix;
      ZipEntry entry = jar.getEntry(jarName);
      if (entry != null) {
        return new JarClassSource(this, jar, entry, jarPath);
      } else {
        return ClassSource.NONE;
      }
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:580
   */
  

    @Override
    public String toString() {
      return "jar:" + jarPath;
    }

}
