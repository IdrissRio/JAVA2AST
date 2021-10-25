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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/grammar/Generics.ast:66
 * @astdecl Wildcard : AbstractWildcard;
 * @production Wildcard : {@link AbstractWildcard};

 */
public class Wildcard extends AbstractWildcard implements Cloneable {
  /**
   * @aspect Java5PrettyPrint
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/PrettyPrint.jadd:373
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print("?");
  }
  /**
   * @aspect PrettyPrintUtil5
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/PrettyPrintUtil.jrag:125
   */
  @Override public String toString() {
    return "?";
  }
  /**
   * @declaredat ASTNode:1
   */
  public Wildcard() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public Wildcard clone() throws CloneNotSupportedException {
    Wildcard node = (Wildcard) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Wildcard copy() {
    try {
      Wildcard node = (Wildcard) clone();
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
   * @declaredat ASTNode:57
   */
  @Deprecated
  public Wildcard fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:67
   */
  public Wildcard treeCopyNoTransform() {
    Wildcard tree = (Wildcard) copy();
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
   * @declaredat ASTNode:87
   */
  public Wildcard treeCopy() {
    Wildcard tree = (Wildcard) copy();
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
  /** @apilevel internal */
  private void type_reset() {
    type_computed = null;
    type_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle type_computed = null;

  /** @apilevel internal */
  protected TypeDecl type_value;

  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:1752
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:295")
  public TypeDecl type() {
    ASTState state = state();
    if (type_computed == ASTState.NON_CYCLE || type_computed == state().cycle()) {
      return type_value;
    }
    type_value = typeWildcard();
    if (state().inCircle()) {
      type_computed = state().cycle();
    
    } else {
      type_computed = ASTState.NON_CYCLE;
    
    }
    return type_value;
  }
  /**
   * @attribute inh
   * @aspect LookupParTypeDecl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:1757
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/Generics.jrag:1757")
  public TypeDecl typeWildcard() {
    TypeDecl typeWildcard_value = getParent().Define_typeWildcard(this, null);
    return typeWildcard_value;
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
