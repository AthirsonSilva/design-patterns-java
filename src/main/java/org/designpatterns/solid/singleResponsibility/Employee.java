package org.designpatterns.solid.singleResponsibility;

// Only one reason to change, the class only has one responsibility
public class Employee {
  public String id;
  public String name;

  public Employee(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
