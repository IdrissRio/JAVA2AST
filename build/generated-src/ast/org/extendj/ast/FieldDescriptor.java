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
 * @aspect BytecodeDescriptor
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:33
 */
 class FieldDescriptor extends java.lang.Object {
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:34
   */
  
    private AbstractClassfileParser p;
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:35
   */
  
    String typeDescriptor;
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:37
   */
  

    public FieldDescriptor(AbstractClassfileParser parser, String name) throws IOException {
      p = parser;
      int descriptor_index = p.u2();
      typeDescriptor = ((CONSTANT_Utf8_Info) p.constantPool[descriptor_index]).string();
      if (AbstractClassfileParser.VERBOSE) {
        p.println("  Field: " + name + ", " + typeDescriptor);
      }
    }
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:46
   */
  

    public Access type() {
      return new TypeDescriptor(p, typeDescriptor).type();
    }
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:50
   */
  

    public boolean isBoolean() {
      return new TypeDescriptor(p, typeDescriptor).isBoolean();
    }

}
