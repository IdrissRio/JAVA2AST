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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:242
 */
 interface GenericTypeDecl {

     
    TypeDecl original();

     
    int getNumTypeParameter();

     
    TypeVariable getTypeParameter(int index);

     
    List<TypeVariable> getTypeParameterList();

     
    public String fullName();

     
    public String typeName();
public TypeDecl makeGeneric(Signatures.ClassSignature s);

public SimpleSet<TypeDecl> addTypeVariables(SimpleSet<TypeDecl> types,
      String name);

  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:243
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:243")
  public boolean isGenericType();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:248
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:248")
  public TypeDecl rawType();
  /** Transforms the parameter and calls the lookupParTypeDecl attribute for ArrayList arguments. 
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:937
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:937")
  public TypeDecl lookupParTypeDecl(ParTypeAccess p);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:945
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:945")
  public TypeDecl lookupParTypeDecl(Collection<TypeDecl> typeArgs);
}
