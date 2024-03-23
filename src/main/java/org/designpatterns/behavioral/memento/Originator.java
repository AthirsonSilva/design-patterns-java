package org.designpatterns.behavioral.memento;

public class Originator {

  private String state;

  public Originator(String state) {
    this.state = state;
  }

  public Memento save() {
    return new Memento(state);
  }

  public void restore(Memento memento) {
    this.setState(memento.getState());
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

}
