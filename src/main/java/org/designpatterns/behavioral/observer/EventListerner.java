package org.designpatterns.behavioral.observer;

public interface EventListerner {

  public void notify(String eventType, String file);

}
