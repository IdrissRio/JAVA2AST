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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:231
 */
public class FileBytecodeClassSource extends BytecodeClassSource {
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:232
   */
  
    private final String filePath;
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:234
   */
  

    public FileBytecodeClassSource(PathPart sourcePath, String path) {
      super(sourcePath);
      this.filePath = path;
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:239
   */
  

    @Override
    public long lastModified() {
      // last modification time computed only when needed
      File file = new File(filePath);
      return file.lastModified();
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:246
   */
  

    @Override
    public InputStream openInputStream() throws IOException {
      File file = new File(filePath);
      return new FileInputStream(file);
    }
  /**
   * @aspect PathPart
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PathPart.jadd:252
   */
  

    @Override
    public String pathName() {
      return filePath;
    }

}
