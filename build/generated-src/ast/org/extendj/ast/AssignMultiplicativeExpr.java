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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/grammar/Java.ast:200
 * @astdecl AssignMultiplicativeExpr : AssignExpr ::= Dest:Expr Source:Expr;
 * @production AssignMultiplicativeExpr : {@link AssignExpr};

 */
public abstract class AssignMultiplicativeExpr extends AssignExpr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public AssignMultiplicativeExpr() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Dest", "Source"},
    type = {"Expr", "Expr"},
    kind = {"Child", "Child"}
  )
  public AssignMultiplicativeExpr(Expr p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public AssignMultiplicativeExpr clone() throws CloneNotSupportedException {
    AssignMultiplicativeExpr node = (AssignMultiplicativeExpr) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:54
   */
  @Deprecated
  public abstract AssignMultiplicativeExpr fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:62
   */
  public abstract AssignMultiplicativeExpr treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public abstract AssignMultiplicativeExpr treeCopy();
  /**
   * Replaces the Dest child.
   * @param node The new node to replace the Dest child.
   * @apilevel high-level
   */
  public AssignMultiplicativeExpr setDest(Expr node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the Dest child.
   * @return The current node used as the Dest child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Dest")
  public Expr getDest() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Dest child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Dest child.
   * @apilevel low-level
   */
  public Expr getDestNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Source child.
   * @param node The new node to replace the Source child.
   * @apilevel high-level
   */
  public AssignMultiplicativeExpr setSource(Expr node) {
    setChild(node, 1);
    return this;
  }
  /**
   * Retrieves the Source child.
   * @return The current node used as the Source child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Source")
  public Expr getSource() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Source child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Source child.
   * @apilevel low-level
   */
  public Expr getSourceNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeCheck.jrag:80
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeCheck", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeCheck.jrag:80")
  public Collection<Problem> typeProblems() {
    {
        Collection<Problem> problems = new LinkedList<Problem>(super.typeProblems());
        if (getSource().type().isBoolean() || getDest().type().isBoolean()) {
          problems.add(error("Multiplicative operators do not operate on boolean types"));
        }
        return problems;
      }
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