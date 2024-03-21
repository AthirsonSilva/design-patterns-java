package org.designpatterns.behavioral.observer;

public class LogOpenListener implements EventListerner {

  @Override
  public void notify(String eventType, String file) {
    System.out.println("Showing logs for " + eventType + " on " + file);
  }

}
