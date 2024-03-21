package org.designpatterns.structural.decorator;

public class Client {

  public static void main(String[] args) {
    NormalcoffeMachine machine = new NormalcoffeMachine();
    machine.makeLargecoffee();
    machine.makeSmallcoffee();

    EnhancedcoffeMachine enhancedMachine = new EnhancedcoffeMachine(machine);
    enhancedMachine.makeLargecoffee();
    enhancedMachine.makeSmallcoffee();
    enhancedMachine.makeMilkcoffe();
  }

}
