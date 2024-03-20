package org.designpatterns.abstractfactory;

public class DatabaseService implements Service {

  @Override
  public String runService() {
    return "Running Database Service";
  }

}
