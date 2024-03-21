package org.designpatterns.creational.abstractfactory;

public class ClientTests {

  public static void main(String[] args) {
    Client client1 = new Client(new DatabaseFactory());
    Client client2 = new Client(new NetworkFactory());

    client1.communicate();
    client2.communicate();
  }

}
