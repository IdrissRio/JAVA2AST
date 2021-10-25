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
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:99
 */
public class Replacement extends java.lang.Object {
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:100
   */
  
         String type;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:101
   */
  
         String source;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:102
   */
  
         String destination;
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:103
   */
  
         public Replacement(String type, String source, String destination){
             this.type = type;
             this.source = source;
             this.destination = destination;
         }
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:109
   */
  
 
     public String getType() {return this.type;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:110
   */
  
     public String getSource(){return this.source;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:111
   */
  
     public String getDestination(){return this.destination;}
  /**
   * @aspect JAVA2AST
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/src/jastadd/JAVA2AST.jrag:113
   */
  
     
     @Override
     public String toString(){
         return "Type: " + getType() + ".\nSource: "+ getSource() + ". \nDestination: " + getDestination();
     }

}
