package org.designpatterns.behavioral.state;

public class Game {

  public State state = new WelcomeState(this);

  public void setState(State state) {
    this.state = state;
  }

}
