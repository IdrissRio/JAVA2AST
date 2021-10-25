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
 * The classified name type of a parsed name or expression.
 * 
 * <p>Method Name is not in this enum because it never occurs in the ASTs
 * produced by our parser: the parser builds the correct node since it has a
 * different structure.
 * @ast enum
 * @aspect SyntacticClassification
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/SyntacticClassification.jrag:47
 */
// Circular.

  /**
   * The classified name type of a parsed name or expression.
   *
   * <p>Method Name is not in this enum because it never occurs in the ASTs
   * produced by our parser: the parser builds the correct node since it has a
   * different structure.
   */
  enum NameType {
    NOT_CLASSIFIED,
    PACKAGE_NAME,
    TYPE_NAME,
    PACKAGE_OR_TYPE_NAME,
    AMBIGUOUS_NAME,
    EXPRESSION_NAME
  }

