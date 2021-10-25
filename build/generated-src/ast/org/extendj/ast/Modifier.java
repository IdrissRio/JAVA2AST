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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/grammar/Java.ast:280
 * @astdecl Modifier : ASTNode ::= <ID:String>;
 * @production Modifier : {@link ASTNode} ::= <span class="component">&lt;ID:{@link String}&gt;</span>;

 */
public class Modifier extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Java4PrettyPrint
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/PrettyPrint.jadd:508
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print(getID());
  }
  /**
   * @declaredat ASTNode:1
   */
  public Modifier() {
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
    name = {"ID"},
    type = {"String"},
    kind = {"Token"}
  )
  public Modifier(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public Modifier(beaver.Symbol p0) {
    setID(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Modifier clone() throws CloneNotSupportedException {
    Modifier node = (Modifier) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public Modifier copy() {
    try {
      Modifier node = (Modifier) clone();
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
   * @declaredat ASTNode:68
   */
  @Deprecated
  public Modifier fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public Modifier treeCopyNoTransform() {
    Modifier tree = (Modifier) copy();
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
   * @declaredat ASTNode:98
   */
  public Modifier treeCopy() {
    Modifier tree = (Modifier) copy();
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public Modifier setID(String value) {
    tokenString_ID = value;
    return this;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public Modifier setID(beaver.Symbol symbol) {
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
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Annotations.jrag:342
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Annotations.jrag:342")
  public boolean isAnnotation(String packageName, String name) {
    boolean isAnnotation_String_String_value = false;
    return isAnnotation_String_String_value;
  }
  /**
   * @attribute syn
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:52
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="JAVA2AST", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:50")
  public String SAFEValue() {
    String SAFEValue_value = prettyPrint();
    return SAFEValue_value;
  }
  /**
   * @attribute syn
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:69
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="JAVA2AST", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:63")
  public String SAFEType() {
    String SAFEType_value = "Modifier";
    return SAFEType_value;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:86
   * @apilevel internal
   */
  public boolean Define_isLeftChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return false;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:86
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isLeftChildOfDot
   */
  protected boolean canDefine_isLeftChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:101
   * @apilevel internal
   */
  public boolean Define_isRightChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return false;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:101
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isRightChildOfDot
   */
  protected boolean canDefine_isRightChildOfDot(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:118
   * @apilevel internal
   */
  public Expr Define_prevExpr(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return prevExprError();
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:118
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute prevExpr
   */
  protected boolean canDefine_prevExpr(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:142
   * @apilevel internal
   */
  public Access Define_nextAccess(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return nextAccessError();
  }
  /**
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:142
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute nextAccess
   */
  protected boolean canDefine_nextAccess(ASTNode _callerNode, ASTNode _childNode) {
    return true;
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
