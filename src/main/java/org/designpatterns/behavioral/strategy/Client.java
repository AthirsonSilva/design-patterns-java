package org.designpatterns.behavioral.strategy;

public class Client {

  public static void main(String[] args) {
    var uppercaseStrategy = new UppercaseStrategy();
    var upperExecutor = new Executor(uppercaseStrategy);
    upperExecutor.printString("Hello World");

    var lowercaseStrategy = new LowercaseStrategy();
    var lowerExecutor = new Executor(lowercaseStrategy);
    lowerExecutor.printString("Hello World");
  }

}
