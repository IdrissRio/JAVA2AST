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
 * Describes a function type.
 * 
 * <p>Function types are defined by functional interfaces, but
 * the function type is not always the identical to a single
 * abstract method in the interface.
 * @ast class
 * @aspect FunctionDescriptor
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:37
 */
 class FunctionDescriptor extends java.lang.Object {
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:38
   */
  
    public final java.util.List<TypeDecl> throwsList;
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:39
   */
  
    public final Option<? extends MethodDecl> method;
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:40
   */
  
    public final InterfaceDecl fromInterface;
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:42
   */
  

    public FunctionDescriptor(InterfaceDecl fromInterface, MethodDecl method,
        java.util.List<TypeDecl> throwsList) {
      this.fromInterface = fromInterface;
      this.method = method.nonWildcardParameterization();
      this.throwsList = throwsList;
    }
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:49
   */
  

    public boolean isGeneric() {
      if (method.hasValue()) {
        return method.get().isGeneric();
      } else {
        return false;
      }
    }
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:57
   */
  

    public InterfaceDecl fromInterface() {
      return this.fromInterface;
    }
  /**
   * @aspect FunctionDescriptor
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/FunctionDescriptor.jrag:61
   */
  

    public String toString() {
      if (method.hasValue()) {
        MethodDecl targetMethod = method.get();
        StringBuilder str = new StringBuilder();
        str.append(targetMethod.toString());
        str.append(" throws ");
        if (throwsList.size() > 0) {
          str.append(throwsList.get(0).typeName());
          for (int i = 1; i < throwsList.size(); i++) {
            str.append(", " + throwsList.get(i).toString());
          }
        }
        return str.toString();
      } else {
        return "<unknown>";
      }
    }

}