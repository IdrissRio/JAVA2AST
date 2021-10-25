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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:262
 */
 class CONSTANT_String_Info extends CONSTANT_Info {
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:263
   */
  
    public int string_index;
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:265
   */
  

    public CONSTANT_String_Info(AbstractClassfileParser parser) throws IOException {
      super(parser);
      string_index = p.u2();
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:270
   */
  

    @Override
    public Expr expr() {
      CONSTANT_Utf8_Info i = (CONSTANT_Utf8_Info) p.constantPool[string_index];
      return Literal.buildStringLiteral(i.string);
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:276
   */
  

    @Override
    public String toString() {
      return "StringInfo: " + p.constantPool[string_index];
    }

}
