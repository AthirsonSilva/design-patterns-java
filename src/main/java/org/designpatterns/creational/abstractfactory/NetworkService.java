package org.designpatterns.creational.abstractfactory;

public class NetworkService implements Service {

  @Override
  public String runService() {
    return "Running Network Service";
  }

}
