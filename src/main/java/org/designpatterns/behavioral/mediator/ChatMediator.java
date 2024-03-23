package org.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {

  private List<ChatUser> users = new ArrayList<>();

  public void sendMessage(String message, ChatUser source) {
    for (ChatUser u : users) {
      if (!u.equals(source)) {
        u.receiveMessage(message);
      }
    }
  }

  public ChatMediator addUser(ChatUser user) {
    users.add(user);
    return this;
  }

}
