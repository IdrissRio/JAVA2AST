/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5-38-gb46f73b */
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
 * @ast node
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/grammar/BoundNames.ast:8
 * @astdecl BoundTypeAccess : TypeAccess ::= <Package:String> <ID:String> <TypeDecl:TypeDecl>;
 * @production BoundTypeAccess : {@link TypeAccess} ::= <span class="component">&lt;TypeDecl:{@link TypeDecl}&gt;</span>;

 */
public class BoundTypeAccess extends TypeAccess implements Cloneable {
  /**
   * @aspect PrettyPrintUtil
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PrettyPrintUtil.jrag:79
   */
  @Override public String toString() {
    return getTypeDecl().toString(); // TypeDecl is a token: no rewrites apply.
  }
  /**
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:447
   */
  public boolean isRaw() {
    return getTypeDecl().isRawType();
  }
  /**
   * @declaredat ASTNode:1
   */
  public BoundTypeAccess() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Package", "ID", "TypeDecl"},
    type = {"String", "String", "TypeDecl"},
    kind = {"Token", "Token", "Token"}
  )
  public BoundTypeAccess(String p0, String p1, TypeDecl p2) {
    setPackage(p0);
    setID(p1);
    setTypeDecl(p2);
  }
  /**
   * @declaredat ASTNode:22
   */
  public BoundTypeAccess(beaver.Symbol p0, beaver.Symbol p1, TypeDecl p2) {
    setPackage(p0);
    setID(p1);
    setTypeDecl(p2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:28
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:34
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushAttrCache() {
    super.flushAttrCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public BoundTypeAccess clone() throws CloneNotSupportedException {
    BoundTypeAccess node = (BoundTypeAccess) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public BoundTypeAccess copy() {
    try {
      BoundTypeAccess node = (BoundTypeAccess) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:72
   */
  @Deprecated
  public BoundTypeAccess fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public BoundTypeAccess treeCopyNoTransform() {
    BoundTypeAccess tree = (BoundTypeAccess) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:102
   */
  public BoundTypeAccess treeCopy() {
    BoundTypeAccess tree = (BoundTypeAccess) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Replaces the lexeme Package.
   * @param value The new value for the lexeme Package.
   * @apilevel high-level
   */
  public BoundTypeAccess setPackage(String value) {
    tokenString_Package = value;
    return this;
  }
  /**
   * JastAdd-internal setter for lexeme Package using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Package
   * @apilevel internal
   */
  public BoundTypeAccess setPackage(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
    return this;
  }
  /**
   * Retrieves the value for the lexeme Package.
   * @return The value for the lexeme Package.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Package")
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public BoundTypeAccess setID(String value) {
    tokenString_ID = value;
    return this;
  }
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public BoundTypeAccess setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
    return this;
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the lexeme TypeDecl.
   * @param value The new value for the lexeme TypeDecl.
   * @apilevel high-level
   */
  public BoundTypeAccess setTypeDecl(TypeDecl value) {
    tokenTypeDecl_TypeDecl = value;
    return this;
  }
  /** @apilevel internal 
   */
  protected TypeDecl tokenTypeDecl_TypeDecl;
  /**
   * Retrieves the value for the lexeme TypeDecl.
   * @return The value for the lexeme TypeDecl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="TypeDecl")
  public TypeDecl getTypeDecl() {
    return tokenTypeDecl_TypeDecl;
  }
  /**
   * @attribute syn
   * @aspect BoundNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/BoundNames.jrag:123
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/LookupType.jrag:332")
  public SimpleSet<TypeDecl> decls() {
    SimpleSet<TypeDecl> decls_value = getTypeDecl();
    return decls_value;
  }
  /**
   * @attribute syn
   * @aspect ReifiableTypes
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/ReifiableTypes.jrag:110
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReifiableTypes", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/ReifiableTypes.jrag:106")
  public boolean isWildcard() {
    boolean isWildcard_value = getTypeDecl() instanceof WildcardType;
    return isWildcard_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }

}
