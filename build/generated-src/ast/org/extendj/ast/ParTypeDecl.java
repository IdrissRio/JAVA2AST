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
 * @ast interface
 * @aspect Generics
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:337
 */
 interface ParTypeDecl {
public Access createQualifiedAccess();


     
    TypeVariable getTypeParameter(int i);

     
    Parameterization getParameterization();

     
    public String typeName();

     
    SimpleSet<Variable> localFields(String name);

     
    Map<String, SimpleSet<MethodDecl>> localMethodsSignatureMap();

     
    List<TypeVariable> getSubstTypeParamList();
public int numTypeParameter();

public TypeVariable typeParameter(int index);

  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsParTypeDecl.jrag:55
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsParTypeDecl.jrag:55")
  public String nameWithArgs();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:340
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:340")
  public boolean isParameterizedType();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:341
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:341")
  public boolean isRawType();
  /**
   * @attribute syn
   * @aspect GenericsTypeCheck
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:628
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsTypeCheck", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:628")
  public boolean sameArguments(ParTypeDecl decl);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:876
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:876")
  public boolean sameSignature(Access a);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:923
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:923")
  public boolean sameSignature(java.util.List<TypeDecl> list);
  /**
   * @attribute inh
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsParTypeDecl.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="GenericsParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsParTypeDecl.jrag:74")
  public TypeDecl genericDecl();
}
