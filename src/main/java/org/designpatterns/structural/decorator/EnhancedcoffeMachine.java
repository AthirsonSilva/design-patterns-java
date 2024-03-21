package org.designpatterns.structural.decorator;

public class EnhancedcoffeMachine implements coffeMachine {

  private final NormalcoffeMachine machine;

  public EnhancedcoffeMachine(NormalcoffeMachine normalcoffeMachine) {
    this.machine = normalcoffeMachine;
  }

  @Override
  public void makeLargecoffee() {
    machine.makeLargecoffee();
  }

  @Override
  public void makeSmallcoffee() {
    System.out.println("Enhanced coffe machine: Making small coffee...");
  }

  public void makeMilkcoffe() {
    System.out.println("Enhanced coffe machine: Making milk coffeee...");
    machine.makeSmallcoffee();
    System.out.println("Enhanced coffe machine: Adding milk...");
  }

}
