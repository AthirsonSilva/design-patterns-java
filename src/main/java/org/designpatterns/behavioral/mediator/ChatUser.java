package org.designpatterns.behavioral.mediator;

public class ChatUser {

  private String name;

  private ChatMediator chatMediator;

  public ChatUser(String name, ChatMediator chatMediator) {
    this.name = name;
    this.chatMediator = chatMediator;
  }

  public void sendMessage(String message) {
    System.out.println(this.name + " sent message: " + message);
    chatMediator.sendMessage(message, this);
  }

  public void receiveMessage(String message) {
    System.out.println(this.name + " received message: " + message);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatMediator getChatMediator() {
    return chatMediator;
  }

  public void setChatMediator(ChatMediator chatMediator) {
    this.chatMediator = chatMediator;
  }

}
