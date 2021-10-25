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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/grammar/Java.ast:138
 * @astdecl UnknownType : ClassDecl ::= Modifiers <ID:String> [SuperClass:Access] Implements:Access* BodyDecl* [ImplicitConstructor:ConstructorDecl];
 * @production UnknownType : {@link ClassDecl};

 */
public class UnknownType extends ClassDecl implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public UnknownType() {
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
    children = new ASTNode[5];
    setChild(new Opt(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);
    setChild(new Opt(), 4);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Modifiers", "ID", "SuperClass", "Implements", "BodyDecl"},
    type = {"Modifiers", "String", "Opt<Access>", "List<Access>", "List<BodyDecl>"},
    kind = {"Child", "Token", "Opt", "List", "List"}
  )
  public UnknownType(Modifiers p0, String p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @declaredat ASTNode:29
   */
  public UnknownType(Modifiers p0, beaver.Symbol p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:37
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    accessibleFromPackage_String_reset();
    instanceOf_TypeDecl_reset();
    subtype_TypeDecl_reset();
    strictSubtype_TypeDecl_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:60
   */
  public UnknownType clone() throws CloneNotSupportedException {
    UnknownType node = (UnknownType) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:65
   */
  public UnknownType copy() {
    try {
      UnknownType node = (UnknownType) clone();
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
   * @declaredat ASTNode:84
   */
  @Deprecated
  public UnknownType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:94
   */
  public UnknownType treeCopyNoTransform() {
    UnknownType tree = (UnknownType) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 4:
          tree.children[i] = new Opt();
          continue;
        }
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
   * @declaredat ASTNode:119
   */
  public UnknownType treeCopy() {
    UnknownType tree = (UnknownType) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 4:
          tree.children[i] = new Opt();
          continue;
        }
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
   * Replaces the Modifiers child.
   * @param node The new node to replace the Modifiers child.
   * @apilevel high-level
   */
  public UnknownType setModifiers(Modifiers node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the Modifiers child.
   * @return The current node used as the Modifiers child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Modifiers")
  public Modifiers getModifiers() {
    return (Modifiers) getChild(0);
  }
  /**
   * Retrieves the Modifiers child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Modifiers child.
   * @apilevel low-level
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public UnknownType setID(String value) {
    tokenString_ID = value;
    return this;
  }
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public UnknownType setID(beaver.Symbol symbol) {
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
   * Replaces the optional node for the SuperClass child. This is the <code>Opt</code>
   * node containing the child SuperClass, not the actual child!
   * @param opt The new node to be used as the optional node for the SuperClass child.
   * @apilevel low-level
   */
  public UnknownType setSuperClassOpt(Opt<Access> opt) {
    setChild(opt, 1);
    return this;
  }
  /**
   * Replaces the (optional) SuperClass child.
   * @param node The new node to be used as the SuperClass child.
   * @apilevel high-level
   */
  public UnknownType setSuperClass(Access node) {
    getSuperClassOpt().setChild(node, 0);
    return this;
  }
  /**
   * Check whether the optional SuperClass child exists.
   * @return {@code true} if the optional SuperClass child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSuperClass() {
    return getSuperClassOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) SuperClass child.
   * @return The SuperClass child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Access getSuperClass() {
    return (Access) getSuperClassOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the SuperClass child. This is the <code>Opt</code> node containing the child SuperClass, not the actual child!
   * @return The optional node for child the SuperClass child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="SuperClass")
  public Opt<Access> getSuperClassOpt() {
    return (Opt<Access>) getChild(1);
  }
  /**
   * Retrieves the optional node for child SuperClass. This is the <code>Opt</code> node containing the child SuperClass, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child SuperClass.
   * @apilevel low-level
   */
  public Opt<Access> getSuperClassOptNoTransform() {
    return (Opt<Access>) getChildNoTransform(1);
  }
  /**
   * Replaces the Implements list.
   * @param list The new list node to be used as the Implements list.
   * @apilevel high-level
   */
  public UnknownType setImplementsList(List<Access> list) {
    setChild(list, 2);
    return this;
  }
  /**
   * Retrieves the number of children in the Implements list.
   * @return Number of children in the Implements list.
   * @apilevel high-level
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Implements list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Implements list.
   * @apilevel low-level
   */
  public int getNumImplementsNoTransform() {
    return getImplementsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Implements list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Implements list.
   * @apilevel high-level
   */
  public Access getImplements(int i) {
    return (Access) getImplementsList().getChild(i);
  }
  /**
   * Check whether the Implements list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasImplements() {
    return getImplementsList().getNumChild() != 0;
  }
  /**
   * Append an element to the Implements list.
   * @param node The element to append to the Implements list.
   * @apilevel high-level
   */
  public UnknownType addImplements(Access node) {
    List<Access> list = (parent == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public UnknownType addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
    return this;
  }
  /**
   * Replaces the Implements list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public UnknownType setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
    return this;
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Implements")
  public List<Access> getImplementsList() {
    List<Access> list = (List<Access>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   */
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Implements list without
   * triggering rewrites.
   */
  public Access getImplementsNoTransform(int i) {
    return (Access) getImplementsListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * Replaces the BodyDecl list.
   * @param list The new list node to be used as the BodyDecl list.
   * @apilevel high-level
   */
  public UnknownType setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 3);
    return this;
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * @return Number of children in the BodyDecl list.
   * @apilevel high-level
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the BodyDecl list.
   * @apilevel low-level
   */
  public int getNumBodyDeclNoTransform() {
    return getBodyDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the BodyDecl list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the BodyDecl list.
   * @apilevel high-level
   */
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl) getBodyDeclList().getChild(i);
  }
  /**
   * Check whether the BodyDecl list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBodyDecl() {
    return getBodyDeclList().getNumChild() != 0;
  }
  /**
   * Append an element to the BodyDecl list.
   * @param node The element to append to the BodyDecl list.
   * @apilevel high-level
   */
  public UnknownType addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public UnknownType addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
    return this;
  }
  /**
   * Replaces the BodyDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public UnknownType setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
    return this;
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="BodyDecl")
  public List<BodyDecl> getBodyDeclList() {
    List<BodyDecl> list = (List<BodyDecl>) getChild(3);
    return list;
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the BodyDecl list without
   * triggering rewrites.
   */
  public BodyDecl getBodyDeclNoTransform(int i) {
    return (BodyDecl) getBodyDeclListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * Replaces the (optional) ImplicitConstructor child.
   * @param node The new node to be used as the ImplicitConstructor child.
   * @apilevel high-level
   */
  public UnknownType setImplicitConstructor(ConstructorDecl node) {
    getImplicitConstructorOpt().setChild(node, 0);
    return this;
  }
  /**
   * Check whether the optional ImplicitConstructor child exists.
   * @return {@code true} if the optional ImplicitConstructor child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasImplicitConstructor() {
    return getImplicitConstructorOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ImplicitConstructor child.
   * @return The ImplicitConstructor child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ConstructorDecl getImplicitConstructor() {
    return (ConstructorDecl) getImplicitConstructorOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for child ImplicitConstructor. This is the <code>Opt</code> node containing the child ImplicitConstructor, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ImplicitConstructor.
   * @apilevel low-level
   */
  public Opt<ConstructorDecl> getImplicitConstructorOptNoTransform() {
    return (Opt<ConstructorDecl>) getChildNoTransform(4);
  }
  /**
   * Retrieves the child position of the optional child ImplicitConstructor.
   * @return The the child position of the optional child ImplicitConstructor.
   * @apilevel low-level
   */
  protected int getImplicitConstructorOptChildPosition() {
    return 4;
  }
  /** @apilevel internal */
  private void accessibleFromPackage_String_reset() {
    accessibleFromPackage_String_computed = null;
    accessibleFromPackage_String_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map accessibleFromPackage_String_values;
  /** @apilevel internal */
  protected java.util.Map accessibleFromPackage_String_computed;
  /**
   * @attribute syn
   * @aspect AccessControl
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/AccessControl.jrag:42
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AccessControl", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/AccessControl.jrag:39")
  public boolean accessibleFromPackage(String packageName) {
    Object _parameters = packageName;
    if (accessibleFromPackage_String_computed == null) accessibleFromPackage_String_computed = new java.util.HashMap(4);
    if (accessibleFromPackage_String_values == null) accessibleFromPackage_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (accessibleFromPackage_String_values.containsKey(_parameters)
        && accessibleFromPackage_String_computed.containsKey(_parameters)
        && (accessibleFromPackage_String_computed.get(_parameters) == ASTState.NON_CYCLE || accessibleFromPackage_String_computed.get(_parameters) == state().cycle())) {
      return (Boolean) accessibleFromPackage_String_values.get(_parameters);
    }
    boolean accessibleFromPackage_String_value = false;
    if (state().inCircle()) {
      accessibleFromPackage_String_values.put(_parameters, accessibleFromPackage_String_value);
      accessibleFromPackage_String_computed.put(_parameters, state().cycle());
    
    } else {
      accessibleFromPackage_String_values.put(_parameters, accessibleFromPackage_String_value);
      accessibleFromPackage_String_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return accessibleFromPackage_String_value;
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/LookupType.jrag:343
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/LookupType.jrag:341")
  public SimpleSet<TypeDecl> asSet() {
    SimpleSet<TypeDecl> asSet_value = emptySet();
    return asSet_value;
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/LookupType.jrag:680
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/LookupType.jrag:678")
  public SimpleSet<TypeDecl> memberTypes(String name) {
    SimpleSet<TypeDecl> memberTypes_String_value = emptySet();
    return memberTypes_String_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:179
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:177")
  public boolean isReferenceType() {
    boolean isReferenceType_value = true;
    return isReferenceType_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:183
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:181")
  public boolean isPrimitiveType() {
    boolean isPrimitiveType_value = true;
    return isPrimitiveType_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:188
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:186")
  public boolean isNumericType() {
    boolean isNumericType_value = true;
    return isNumericType_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:192
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:190")
  public boolean isIntegralType() {
    boolean isIntegralType_value = true;
    return isIntegralType_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:196
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:194")
  public boolean isBoolean() {
    boolean isBoolean_value = true;
    return isBoolean_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:206
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:204")
  public boolean isInt() {
    boolean isInt_value = true;
    return isInt_value;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:246
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:245")
  public boolean isUnknown() {
    boolean isUnknown_value = true;
    return isUnknown_value;
  }
  /** @apilevel internal */
  private void instanceOf_TypeDecl_reset() {
    instanceOf_TypeDecl_computed = null;
    instanceOf_TypeDecl_values = null;
  }
  /** @apilevel internal */
  protected java.util.Map instanceOf_TypeDecl_values;
  /** @apilevel internal */
  protected java.util.Map instanceOf_TypeDecl_computed;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:485
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:442")
  public boolean instanceOf(TypeDecl type) {
    Object _parameters = type;
    if (instanceOf_TypeDecl_computed == null) instanceOf_TypeDecl_computed = new java.util.HashMap(4);
    if (instanceOf_TypeDecl_values == null) instanceOf_TypeDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (instanceOf_TypeDecl_values.containsKey(_parameters)
        && instanceOf_TypeDecl_computed.containsKey(_parameters)
        && (instanceOf_TypeDecl_computed.get(_parameters) == ASTState.NON_CYCLE || instanceOf_TypeDecl_computed.get(_parameters) == state().cycle())) {
      return (Boolean) instanceOf_TypeDecl_values.get(_parameters);
    }
    boolean instanceOf_TypeDecl_value = instanceOf_compute(type);
    if (state().inCircle()) {
      instanceOf_TypeDecl_values.put(_parameters, instanceOf_TypeDecl_value);
      instanceOf_TypeDecl_computed.put(_parameters, state().cycle());
    
    } else {
      instanceOf_TypeDecl_values.put(_parameters, instanceOf_TypeDecl_value);
      instanceOf_TypeDecl_computed.put(_parameters, ASTState.NON_CYCLE);
    
    }
    return instanceOf_TypeDecl_value;
  }
  /** @apilevel internal */
  private boolean instanceOf_compute(TypeDecl type) {
      return subtype(type);
    }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:452
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:458")
  public boolean isSupertypeOfClassDecl(ClassDecl type) {
    boolean isSupertypeOfClassDecl_ClassDecl_value = true;
    return isSupertypeOfClassDecl_ClassDecl_value;
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:453
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:477")
  public boolean isSupertypeOfInterfaceDecl(InterfaceDecl type) {
    boolean isSupertypeOfInterfaceDecl_InterfaceDecl_value = true;
    return isSupertypeOfInterfaceDecl_InterfaceDecl_value;
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:454
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:491")
  public boolean isSupertypeOfArrayDecl(ArrayDecl type) {
    boolean isSupertypeOfArrayDecl_ArrayDecl_value = true;
    return isSupertypeOfArrayDecl_ArrayDecl_value;
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:455
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:516")
  public boolean isSupertypeOfPrimitiveType(PrimitiveType type) {
    boolean isSupertypeOfPrimitiveType_PrimitiveType_value = true;
    return isSupertypeOfPrimitiveType_PrimitiveType_value;
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:456
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeWideningAndIdentity", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:526")
  public boolean isSupertypeOfNullType(NullType type) {
    boolean isSupertypeOfNullType_NullType_value = true;
    return isSupertypeOfNullType_NullType_value;
  }
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/AutoBoxing.jrag:238
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NumericPromotion", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:156")
  public TypeDecl unaryNumericPromotion() {
    TypeDecl unaryNumericPromotion_value = this;
    return unaryNumericPromotion_value;
  }
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/AutoBoxing.jrag:283
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NumericPromotion", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/TypeAnalysis.jrag:165")
  public TypeDecl binaryNumericPromotion(TypeDecl type) {
    TypeDecl binaryNumericPromotion_TypeDecl_value = this;
    return binaryNumericPromotion_TypeDecl_value;
  }
  /** @apilevel internal */
  private void subtype_TypeDecl_reset() {
    subtype_TypeDecl_values = null;
  }
  protected java.util.Map subtype_TypeDecl_values;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:500")
  public boolean subtype(TypeDecl type) {
    Object _parameters = type;


    if (subtype_TypeDecl_values == null) subtype_TypeDecl_values = new java.util.HashMap(4);
    ASTState.CircularValue _value;
    if (subtype_TypeDecl_values.containsKey(_parameters)) {
      Object _cache = subtype_TypeDecl_values.get(_parameters);
      if (!(_cache instanceof ASTState.CircularValue)) {
        return (Boolean) _cache;
      } else {
        _value = (ASTState.CircularValue) _cache;
      }
    } else {
      _value = new ASTState.CircularValue();
      subtype_TypeDecl_values.put(_parameters, _value);
      _value.value = true;
    }
    ASTState state = state();
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      boolean new_subtype_TypeDecl_value;
      do {
        _value.cycle = state.nextCycle();
        new_subtype_TypeDecl_value = false;
        if (((Boolean)_value.value) != new_subtype_TypeDecl_value) {
          state.setChangeInCycle();
          _value.value = new_subtype_TypeDecl_value;
        }
      } while (state.testAndClearChangeInCycle());
      subtype_TypeDecl_values.put(_parameters, new_subtype_TypeDecl_value);

      state.leaveCircle();
      return new_subtype_TypeDecl_value;
    } else if (_value.cycle != state.cycle()) {
      _value.cycle = state.cycle();
      boolean new_subtype_TypeDecl_value = false;
      if (((Boolean)_value.value) != new_subtype_TypeDecl_value) {
        state.setChangeInCycle();
        _value.value = new_subtype_TypeDecl_value;
      }
      return new_subtype_TypeDecl_value;
    } else {
      return (Boolean) _value.value;
    }
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:509
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:515")
  public boolean supertypeClassDecl(ClassDecl type) {
    boolean supertypeClassDecl_ClassDecl_value = true;
    return supertypeClassDecl_ClassDecl_value;
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:510
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:531")
  public boolean supertypeInterfaceDecl(InterfaceDecl type) {
    boolean supertypeInterfaceDecl_InterfaceDecl_value = true;
    return supertypeInterfaceDecl_InterfaceDecl_value;
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:511
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:547")
  public boolean supertypeArrayDecl(ArrayDecl type) {
    boolean supertypeArrayDecl_ArrayDecl_value = true;
    return supertypeArrayDecl_ArrayDecl_value;
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:512
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:575")
  public boolean supertypePrimitiveType(PrimitiveType type) {
    boolean supertypePrimitiveType_PrimitiveType_value = true;
    return supertypePrimitiveType_PrimitiveType_value;
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:513
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericsSubtype.jrag:584")
  public boolean supertypeNullType(NullType type) {
    boolean supertypeNullType_NullType_value = true;
    return supertypeNullType_NullType_value;
  }
  /**
   * @attribute syn
   * @aspect GenericBoundCheck
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericBoundCheck.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericBoundCheck", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java5/frontend/GenericBoundCheck.jrag:40")
  public boolean withinBounds(TypeDecl bound) {
    boolean withinBounds_TypeDecl_value = false;
    return withinBounds_TypeDecl_value;
  }
  /** @apilevel internal */
  private void strictSubtype_TypeDecl_reset() {
    strictSubtype_TypeDecl_values = null;
  }
  protected java.util.Map strictSubtype_TypeDecl_values;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:363")
  public boolean strictSubtype(TypeDecl type) {
    Object _parameters = type;


    if (strictSubtype_TypeDecl_values == null) strictSubtype_TypeDecl_values = new java.util.HashMap(4);
    ASTState.CircularValue _value;
    if (strictSubtype_TypeDecl_values.containsKey(_parameters)) {
      Object _cache = strictSubtype_TypeDecl_values.get(_parameters);
      if (!(_cache instanceof ASTState.CircularValue)) {
        return (Boolean) _cache;
      } else {
        _value = (ASTState.CircularValue) _cache;
      }
    } else {
      _value = new ASTState.CircularValue();
      strictSubtype_TypeDecl_values.put(_parameters, _value);
      _value.value = true;
    }
    ASTState state = state();
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      boolean new_strictSubtype_TypeDecl_value;
      do {
        _value.cycle = state.nextCycle();
        new_strictSubtype_TypeDecl_value = true;
        if (((Boolean)_value.value) != new_strictSubtype_TypeDecl_value) {
          state.setChangeInCycle();
          _value.value = new_strictSubtype_TypeDecl_value;
        }
      } while (state.testAndClearChangeInCycle());
      strictSubtype_TypeDecl_values.put(_parameters, new_strictSubtype_TypeDecl_value);

      state.leaveCircle();
      return new_strictSubtype_TypeDecl_value;
    } else if (_value.cycle != state.cycle()) {
      _value.cycle = state.cycle();
      boolean new_strictSubtype_TypeDecl_value = true;
      if (((Boolean)_value.value) != new_strictSubtype_TypeDecl_value) {
        state.setChangeInCycle();
        _value.value = new_strictSubtype_TypeDecl_value;
      }
      return new_strictSubtype_TypeDecl_value;
    } else {
      return (Boolean) _value.value;
    }
  }
  /**
   * @attribute syn
   * @aspect StrictSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:372
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:378")
  public boolean strictSupertypeClassDecl(ClassDecl type) {
    boolean strictSupertypeClassDecl_ClassDecl_value = true;
    return strictSupertypeClassDecl_ClassDecl_value;
  }
  /**
   * @attribute syn
   * @aspect StrictSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:373
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:397")
  public boolean strictSupertypeInterfaceDecl(InterfaceDecl type) {
    boolean strictSupertypeInterfaceDecl_InterfaceDecl_value = true;
    return strictSupertypeInterfaceDecl_InterfaceDecl_value;
  }
  /**
   * @attribute syn
   * @aspect StrictSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:374
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:413")
  public boolean strictSupertypeArrayDecl(ArrayDecl type) {
    boolean strictSupertypeArrayDecl_ArrayDecl_value = true;
    return strictSupertypeArrayDecl_ArrayDecl_value;
  }
  /**
   * @attribute syn
   * @aspect StrictSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:375
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:442")
  public boolean strictSupertypePrimitiveType(PrimitiveType type) {
    boolean strictSupertypePrimitiveType_PrimitiveType_value = true;
    return strictSupertypePrimitiveType_PrimitiveType_value;
  }
  /**
   * @attribute syn
   * @aspect StrictSubtype
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:376
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="StrictSubtype", declaredAt="/Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java8/frontend/GenericsSubtype.jrag:451")
  public boolean strictSupertypeNullType(NullType type) {
    boolean strictSupertypeNullType_NullType_value = true;
    return strictSupertypeNullType_NullType_value;
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