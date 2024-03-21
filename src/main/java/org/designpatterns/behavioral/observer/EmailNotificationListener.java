package org.designpatterns.behavioral.observer;

public class EmailNotificationListener implements EventListerner {

  @Override
  public void notify(String eventType, String file) {
    System.out.println("Sending email notification for " + eventType + " on " + file);
  }

}
