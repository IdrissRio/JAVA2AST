# JAVA2AST

Given a Java program, generates a table containing the details of all the interesting ASTNodes in the Java Program.


Java2AST is build as an extension of the ExtendJ Java Compiler. The properties are computed on demand using the Reference Attributed Grammar System JastAdd.
ExtendJ require a Java SDK >= 8.

## Installation
Clone the repository
```
git clone https://github.com/IdrissRio/JAVA2AST.git
```
then move into the `JAVA2AST` directory using the command:
```
cd JAVA2AST
```

Now, generate the jar file `java2ast.jar` by running:

```
./gradlew build
```

## How to use it

