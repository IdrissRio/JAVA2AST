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
 * @aspect BranchTarget
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:48
 */
 class LazyFinallyIterator extends java.lang.Object implements Iterator<FinallyHost> {
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:49
   */
  
    private final Stmt branch;
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:50
   */
  
    private FinallyHost enclosing;
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:52
   */
  

    LazyFinallyIterator(Stmt root) {
      branch = root;
      enclosing = branch.enclosingFinally(branch);
    }
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:57
   */
  

    @Override
    public boolean hasNext() {
      return enclosing != null;
    }
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:62
   */
  

    @Override
    public FinallyHost next() {
      FinallyHost b = enclosing;
      enclosing = enclosing.enclosingFinally(branch);
      return b;
    }
  /**
   * @aspect BranchTarget
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BranchTarget.jrag:69
   */
  

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }

}
