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
 * A part of a paritally classified parse name.
 * @ast class
 * @aspect QualifiedNames
 * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:246
 */
 class NamePart extends java.lang.Object {
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:247
   */
  
    public static final NamePart EMPTY = new NamePart() {
      @Override
      public boolean isPackageQualifier() {
        return true;
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        return !context.lookupType(typeName.toString()).isEmpty();
      }

      @Override
      public String toString() {
        return "";
      }
    };
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:264
   */
  

    protected NamePart pred = EMPTY;
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:265
   */
  
    protected String name;
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:266
   */
  
    protected int start;
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:267
   */
  
    protected int end;
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:269
   */
  

    protected NamePart() {
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:272
   */
  

    public NamePart(Symbol sym) {
      name = (String) sym.value;
      start = sym.getStart();
      end = sym.getEnd();
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:278
   */
  

    public TypeDecl lookupType(Expr context) {
      return null;
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:282
   */
  

    public boolean hasType(Expr context, NamePart typeName) {
      return false;
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:286
   */
  

    public Access buildAccess() {
      throw new Error("Can not build access from unclassified name part.");
    }
  /**
   * @return {@code true} if this name part can precede a package name.
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:293
   */
  

    /**
     * @return {@code true} if this name part can precede a package name.
     */
    public boolean isPackageQualifier() {
      return false;
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:297
   */
  

    @Override
    public String toString() {
      return name;
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:302
   */
  

    static class Package extends NamePart {
      public Package(NamePart qualifier, NamePart pkgName) {
        if (qualifier instanceof Package) {
          name = qualifier.toString() + "." + pkgName.toString();
          start = qualifier.start;
          end = pkgName.end;
        } else {
          name = pkgName.toString();
          start = pkgName.start;
          end = pkgName.end;
        }
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl type = context.lookupType(name, typeName.toString());
        if (!type.isUnknown()) {
          TypeDecl hostType = context.hostType();
          if (hostType != null && type.accessibleFrom(hostType)) {
            return true;
          } else if (hostType == null && type.accessibleFromPackage(context.hostPackage())) {
            return true;
          }
        }
        return false;
      }

      @Override
      public boolean isPackageQualifier() {
        return true;
      }

      @Override
      public Access buildAccess() {
        return new PackageAccess(name, start, end);
      }
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:340
   */
  

    static class Type extends NamePart {
      protected final String pkg;

      public Type(NamePart qualifier, NamePart typeName) {
        if (qualifier instanceof Package) {
          pkg = qualifier.toString();
          name = typeName.toString();
          start = qualifier.start;
          end = typeName.end;
        } else {
          pred = qualifier;
          pkg = "";
          name = typeName.toString();
          start = typeName.start;
          end = typeName.end;
        }
      }

      @Override
      public TypeDecl lookupType(Expr context) {
        if (pkg.isEmpty()) {
          TypeDecl hostType = pred.lookupType(context);
          SimpleSet<TypeDecl> type;
          if (hostType == null) {
            type = context.lookupType(name);
          } else {
            type = context.keepAccessibleTypes(hostType.memberTypes(name));
          }
          return type.isSingleton() ? type.singletonValue() : null;
        } else {
          return context.lookupType(pkg, name);
        }
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl hostType = lookupType(context);
        return hostType != null
            && !context.keepAccessibleTypes(hostType.memberTypes(typeName.toString())).isEmpty();
      }

      @Override
      public Access buildAccess() {
        TypeAccess access = new TypeAccess(name, start, end);
        if (!pkg.isEmpty()) {
          access.setPackage(pkg);
        }
        return access;
      }

      @Override
      public String toString() {
        return pkg.isEmpty() ? name : pkg + "." + name;
      }
    }
  /**
   * @aspect QualifiedNames
   * @declaredat /Users/idrissr/phd/git/lund/research/artifacts/Composable-Software-Tools/JAVA2AST/extendj/java4/frontend/ResolveAmbiguousNames.jrag:396
   */
  

    static class VarName extends NamePart {
      public VarName(NamePart qualifier, NamePart varName) {
        pred = qualifier;
        name = varName.toString();
        start = varName.start;
        end = varName.end;
      }

      @Override
      public boolean hasType(Expr context, NamePart typeName) {
        TypeDecl hostType = lookupType(context);
        return hostType != null
            && !context.keepAccessibleTypes(hostType.memberTypes(typeName.toString())).isEmpty();
      }

      @Override
      public TypeDecl lookupType(Expr context) {
        if (pred == NamePart.EMPTY) {
          SimpleSet<Variable> var = context.lookupVariable(name.toString());
          if (var.isSingleton()) {
            return var.singletonValue().type();
          }
        } else {
          TypeDecl hostType = pred.lookupType(context);
          if (hostType != null) {
            SimpleSet<Variable> var = context.keepAccessibleFields(
                hostType.memberFields(name.toString()));
            if (var.isSingleton()) {
              return var.singletonValue().type();
            }
          }
        }
        return null;
      }

      @Override
      public Access buildAccess() {
        return new VarAccess(name, start, end);
      }
    }

}
