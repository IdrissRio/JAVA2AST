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
 * @aspect JAVA2AST
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:79
 */
public class Property extends java.lang.Object {
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:80
   */
  
         String name;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:81
   */
  
         String command;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:82
   */
  
         String description;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:83
   */
  
         public Property(String name, String command, String description){
         this.name = name;
         this.command = command;
         this.description = description;
         }
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:88
   */
  
         public String getName(){return this.name;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:89
   */
  
         public String getCommand(){return this.command;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:90
   */
  
         public String getDescription(){return this.description;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:92
   */
  
 
         @Override
         public String toString(){
             return name;
         }

}
