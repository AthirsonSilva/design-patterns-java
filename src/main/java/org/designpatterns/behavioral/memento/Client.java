package org.designpatterns.behavioral.memento;

public class Client {

  public static void main(String[] args) {
    Originator originator = new Originator("Initial state");
    CareTaker careTaker = new CareTaker();

    careTaker.saveState(originator.save());
    System.out.println("Current state: " + originator.getState());

    originator.setState("State 1");
    careTaker.saveState(originator.save());
    System.out.println("Current state: " + originator.getState());

    originator.setState("State 2");
    careTaker.saveState(originator.save());
    System.out.println("Current state: " + originator.getState());

    originator.restore(careTaker.restoreState(0));
    System.out.println("Restored to state: " + originator.getState());

    originator.restore(careTaker.restoreState(2));
    System.out.println("Restored to state: " + originator.getState());

    originator.restore(careTaker.restoreState(18888888));
    System.out.println("Restored to state: " + originator.getState());
  }

}
