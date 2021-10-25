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
 * A folder path listed in the classpath. Can contain many .java or .class
 * files.
 * @ast class
 * @aspect PathPart
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:391
 */
public abstract class FolderPath extends PathPart {
  /**
   * The root folder of this path part.
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:395
   */
  
    /**
     * The root folder of this path part.
     */
    private final File folder;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:396
   */
  
    private final String folderPath;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:398
   */
  

    protected FolderPath(String folderPath, boolean isSource) {
      super(isSource);
      this.folder = new File(folderPath);
      this.folderPath = folderPath;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:404
   */
  

    protected FolderPath(File folder, boolean isSource) {
      super(isSource);
      this.folder = folder;
      this.folderPath = folder.getPath();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:410
   */
  

    @Override
    public String getPath() {
      return folderPath;
    }
  /**
   * Check if the package exists as a subdirectory.
   * 
   * <p>We need to use getCanonicalFile in order to get the case-sensitive
   * package name on case-insensitive file systems or we might incorrectly
   * report a package name conflict.
   * 
   * <p>NB: This does not work well with symlinks!
   * 
   * @param name The qualified name of the package
   * @return {@code true} if the subdirectory matching the package exists
   * and contains at least one source or class file.
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:428
   */
  

    /**
     * Check if the package exists as a subdirectory.
     *
     * <p>We need to use getCanonicalFile in order to get the case-sensitive
     * package name on case-insensitive file systems or we might incorrectly
     * report a package name conflict.
     *
     * <p>NB: This does not work well with symlinks!
     *
     * @param name The qualified name of the package
     * @return {@code true} if the subdirectory matching the package exists
     * and contains at least one source or class file.
     */
    @Override
    public boolean hasPackage(String name) {
      boolean packageIsEmpty = true;
      int index = name.lastIndexOf('.');
      String basePackageName = name.substring(index == -1 ? 0 : index+1);
      String subdir = name.replace('.', File.separatorChar);
      File pkgFolder = new File(folder, subdir);
      Collection<String> fileSet = Collections.emptyList();
      try {
        // Make sure that there exists a directory with the same name
        // (case-sensitive) as the requested package
        File canonical = pkgFolder.getCanonicalFile();
        if (canonical.isDirectory() && (name.isEmpty() ||
              canonical.getName().equals(basePackageName))) {
          File[] files = canonical.listFiles();
          for (File file: files) {
            if (file.isFile() && file.getName().endsWith(fileSuffix)) {
              // found one source file in the package
              packageIsEmpty = false;
              break;
            }
          }
        }
      } catch (Exception e) {
        // If an exception is thrown then packageIsEmpty will be false
        // which indicates that the package does not exist.
        // The likely cause of the exception would be getCanonicalFile.
      }
      return !packageIsEmpty;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:459
   */
  

    @Override
    public ClassSource findSource(String name) {
      String filePath = name.replace('.', File.separatorChar) + fileSuffix;
      File classFile = new File(folder, filePath);
      if (classFile.isFile() && classFile.canRead()) {
        String pathName = classFile.getPath();
        if (isSource) {
          return new FileClassSource(this, pathName);
        } else {
          return new FileBytecodeClassSource(this, pathName);
        }
      }
      return ClassSource.NONE;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:474
   */
  

    @Override
    public String toString() {
      return folder.getPath();
    }

}
