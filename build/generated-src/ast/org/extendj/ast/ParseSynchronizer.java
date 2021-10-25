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
 * This is a helper class used to ensure that only one thread
 * parses a single demand loaded compilation unit.
 * 
 * <p>A thread calls the first() method to check if it should parse the
 * compilation unit. If first() returns {@code true} then the thread proceeds
 * to parse the compilation unit and stores the result by calling set(). If
 * first() instead returns {@code false} the thread will call get() which
 * waits until the result is available.
 * @ast class
 * @aspect ClassPath
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:440
 */
 class ParseSynchronizer extends java.lang.Object {
  /**
   * @aspect ClassPath
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:441
   */
  
    private AtomicBoolean first = new AtomicBoolean(true);
  /**
   * @aspect ClassPath
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:442
   */
  
    private CompilationUnit result = null;
  /**
   * @return {@code true} in only one thread calling this method.
   * Returns {@code false} in all other threads.
   * @aspect ClassPath
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:448
   */
  

    /**
     * @return {@code true} in only one thread calling this method.
     * Returns {@code false} in all other threads.
     */
    public boolean first() {
      return first.getAndSet(false);
    }
  /**
   * Share a parsed compilation unit with other threads.
   * The compilation unit must not be null!
   * @aspect ClassPath
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:456
   */
  

    /**
     * Share a parsed compilation unit with other threads.
     * The compilation unit must not be null!
     */
    public synchronized void set(CompilationUnit result) {
      this.result = result;
      notifyAll();
    }
  /**
   * Read the stored compilation unit. This blocks until the result has been
   * stored by another thread.
   * @aspect ClassPath
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ClassPath.jrag:465
   */
  

    /**
     * Read the stored compilation unit. This blocks until the result has been
     * stored by another thread.
     */
    public synchronized CompilationUnit get() {
      try {
        while (result == null) {
          wait();
        }
      } catch (InterruptedException e) {
      }
      return result;
    }

}
