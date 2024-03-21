package org.designpatterns.structural.facade;

public class Communicator {

  public void send(String data) {
    System.out.println("Sending data => " + data);
  }

  public void receive() {
    System.out.println("Receiving data...");
  }

}
