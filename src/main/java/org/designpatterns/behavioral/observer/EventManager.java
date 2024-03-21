package org.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {

  HashMap<String, ArrayList<EventListerner>> listeners = new HashMap<>();

  public EventManager(String... operations) {
    for (String operation : operations) {
      listeners.put(operation, new ArrayList<EventListerner>());
    }
  }

  public void subscribe(String event, EventListerner listener) {
    ArrayList<EventListerner> list = listeners.get(event);
    if (!list.contains(listener)) {
      list.add(listener);
    }
  }

  public void unsubscribe(String event, EventListerner listener) {
    ArrayList<EventListerner> list = listeners.get(event);
    if (!list.contains(listener)) {
      list.remove(listener);
    }
  }

  public void notify(String event, String file) {
    ArrayList<EventListerner> list = listeners.get(event);
    for (EventListerner listener : list) {
      listener.notify(event, file);
    }
  }

}
