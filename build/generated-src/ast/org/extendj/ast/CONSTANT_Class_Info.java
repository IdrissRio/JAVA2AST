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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:32
 */
 class CONSTANT_Class_Info extends CONSTANT_Info {
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:33
   */
  
    public int name_index;
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:35
   */
  

    public CONSTANT_Class_Info(AbstractClassfileParser parser) throws IOException {
      super(parser);
      name_index = p.u2();
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:40
   */
  

    @Override
    public String toString() {
      return "ClassInfo: " + name();
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:45
   */
  

    public String name() {
      String name = ((CONSTANT_Utf8_Info) p.constantPool[name_index]).string();
      name = name.replace('/', '.');
      return name;
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:51
   */
  

    public String simpleName() {
      String name = name();
      int pos = name.lastIndexOf('.');
      return name.substring(pos + 1, name.length());
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:57
   */
  

    public String packageDecl() {
      String name = name();
      int pos = name.lastIndexOf('.');
      if (pos == -1) {
        return "";
      }
      return name.substring(0, pos);
    }
  /**
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BytecodeCONSTANT.jrag:66
   */
  

    public Access access() {
      String name = name();
      int pos = name.lastIndexOf('.');
      String typeName = name.substring(pos + 1, name.length());
      String packageName = pos == -1 ? "" : name.substring(0, pos);
      if (typeName.indexOf('$') != -1) {
        return new BytecodeTypeAccess(packageName, typeName);
      } else {
        return new TypeAccess(packageName, typeName);
      }
    }

}
