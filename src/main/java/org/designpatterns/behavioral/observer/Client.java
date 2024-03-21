package org.designpatterns.behavioral.observer;

public class Client {

  public static void main(String[] args) {
    Editor editor = new Editor();
    EmailNotificationListener emailListener = new EmailNotificationListener();
    LogOpenListener logOpenListener = new LogOpenListener();

    editor.eventManager.subscribe("open", emailListener);
    editor.eventManager.subscribe("save", emailListener);
    editor.eventManager.subscribe("open", logOpenListener);

    editor.openFile("test.txt");
    editor.saveFile();
  }

}
