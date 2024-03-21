package org.designpatterns.structural.decorator;

public class NormalcoffeMachine implements coffeMachine {

  @Override
  public void makeLargecoffee() {
    System.out.println("Normal coffe machine: Making large coffee...");
  }

  @Override
  public void makeSmallcoffee() {
    System.out.println("Normal coffe machine: Making small coffee...");
  }

}
