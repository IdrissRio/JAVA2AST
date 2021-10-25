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
 * @aspect BytecodeCONSTANT
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:212
 */
 class CONSTANT_Long_Info extends CONSTANT_Info {
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:213
   */
  
    public long value;
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:215
   */
  

    public CONSTANT_Long_Info(AbstractClassfileParser parser) throws IOException {
      super(parser);
      value = p.readLong();
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:220
   */
  

    @Override
    public String toString() {
      return "LongInfo: " + Long.toString(value);
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:225
   */
  

    @Override
    public Expr expr() {
      return Literal.buildLongLiteral(value);
    }

}
