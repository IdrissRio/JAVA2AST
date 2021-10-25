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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:127
 */
 class MethodDescriptor extends java.lang.Object {
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:128
   */
  
    private AbstractClassfileParser p;
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:129
   */
  
    private String parameterDescriptors;
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:130
   */
  
    private String typeDescriptor;
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:132
   */
  

    public MethodDescriptor(AbstractClassfileParser parser, String name) throws IOException {
      p = parser;
      int descriptor_index = p.u2();
      String descriptor = ((CONSTANT_Utf8_Info) p.constantPool[descriptor_index]).string();
      if (AbstractClassfileParser.VERBOSE) {
        p.println("  Method: " + name + ", " + descriptor);
      }
      int pos = descriptor.indexOf(')');
      parameterDescriptors = descriptor.substring(1, pos);
      typeDescriptor = descriptor.substring(pos + 1, descriptor.length());
    }
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:144
   */
  

    public List parameterList() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterList();
    }
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:149
   */
  

    public List parameterListSkipFirst() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterListSkipFirst();
    }
  /**
   * @aspect BytecodeDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/BytecodeDescriptor.jrag:154
   */
  

    public Access type() {
      TypeDescriptor d = new TypeDescriptor(p, typeDescriptor);
      return d.type();
    }

}
