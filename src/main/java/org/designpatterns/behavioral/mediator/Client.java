package org.designpatterns.behavioral.mediator;

public class Client {

  public static void main(String[] args) {
    ChatMediator chatMediator = new ChatMediator();
    ChatUser alice = new ChatUser("Alice", chatMediator);
    ChatUser bob = new ChatUser("Bob", chatMediator);
    ChatUser carol = new ChatUser("Carol", chatMediator);
    chatMediator.addUser(alice).addUser(bob).addUser(carol);
    alice.sendMessage("Hello");
    bob.sendMessage("Hi there!");
  }

}
