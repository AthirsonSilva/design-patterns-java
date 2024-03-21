package org.designpatterns.creational.abstractfactory;

public class NetworkResponse implements Response {

  @Override
  public String getResponse() {
    return "Network Response";
  }

}
