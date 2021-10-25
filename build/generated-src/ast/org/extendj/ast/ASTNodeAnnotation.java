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
 * @declaredat ASTNode:224
 */
public class ASTNodeAnnotation extends java.lang.Object {
  /**
   * @declaredat ASTNode:225
   */
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface Child {
    String name();
  }
  /**
   * @declaredat ASTNode:232
   */
  
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface ListChild {
    String name();
  }
  /**
   * @declaredat ASTNode:239
   */
  
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface OptChild {
    String name();
  }
  /**
   * @declaredat ASTNode:246
   */
  
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface Token {
    String name();
  }
  /**
   * @declaredat ASTNode:253
   */
  
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface Attribute {
    Kind kind();
    boolean isCircular() default false;
    boolean isNTA() default false;
  }
  /**
   * @declaredat ASTNode:261
   */
  
  public enum Kind { SYN, INH, COLL }
  /**
   * @declaredat ASTNode:263
   */
  

  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
  @java.lang.annotation.Documented
  public @interface Source {
    String aspect() default "";
    String declaredAt() default "";
  }
  /**
   * @declaredat ASTNode:271
   */
  

  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target(java.lang.annotation.ElementType.CONSTRUCTOR)
  @java.lang.annotation.Documented
  public @interface Constructor{
    String[] name(); 
    String[] type(); 
    String[] kind(); 
  }

}
