package lund;

//  A class to represent all the properties of the AST.
//  Fields:
//          name: Name of the property
//          command: Invokes the property of the given node
//          description: Description of all the properties
public class Property {
  String name;
  String command;
  String description;
  public Property(String name, String command, String description) {
    this.name = name;
    this.command = command;
    this.description = description;
  }
  public String getName() { return this.name; }
  public String getCommand() { return this.command; }
  public String getDescription() { return this.description; }

  @Override
  public String toString() {
    return name;
  }
}