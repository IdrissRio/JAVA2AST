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
 * @ast class
 * @aspect PathPart
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:258
 */
public class JarClassSource extends BytecodeClassSource {
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:259
   */
  
    private final ZipFile jar;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:260
   */
  
    private final ZipEntry entry;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:261
   */
  
    private final String jarPath;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:263
   */
  

    public JarClassSource(PathPart sourcePath, ZipFile jar, ZipEntry entry,
        String jarPath) {
      super(sourcePath);
      this.jar = jar;
      this.entry = entry;
      this.jarPath = jarPath;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:271
   */
  

    public String jarFilePath() {
      return entry.getName();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:275
   */
  

    @Override
    public long lastModified() {
      return entry.getTime();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:280
   */
  

    @Override
    public InputStream openInputStream() throws IOException {
      return jar.getInputStream(entry);
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:285
   */
  

    @Override
    public String pathName() {
      return jarPath;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:290
   */
  

    @Override
    public String relativeName() {
      return entry.getName();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:295
   */
  

    @Override
    public String sourceName() {
      return pathName() + ":" + relativeName();
    }

}
