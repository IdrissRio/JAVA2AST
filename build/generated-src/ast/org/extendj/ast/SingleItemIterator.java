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
 * An iterator that iterates over one single item.
 * 
 * <p>This is used to iterate singleton sets.
 * @ast class
 * @aspect DataStructures
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:253
 */
public class SingleItemIterator<T> extends java.lang.Object implements Iterator<T> {
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:254
   */
  
    private boolean done = false;
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:255
   */
  
    private final T item;
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:257
   */
  

    public SingleItemIterator(T item) {
      this.item = item;
    }
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:261
   */
  

    @Override
    public boolean hasNext() {
      return !done;
    }
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:266
   */
  

    @Override
    public T next() {
      done = true;
      return item;
    }
  /**
   * @aspect DataStructures
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/DataStructures.jrag:272
   */
  

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }

}
