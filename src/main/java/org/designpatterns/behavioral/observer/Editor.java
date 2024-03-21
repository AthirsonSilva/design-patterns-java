package org.designpatterns.behavioral.observer;

public class Editor {

  public EventManager eventManager = new EventManager("open", "save");
  private String file = "";

  public void openFile(String fileName) {
    file = fileName;
    eventManager.notify("open", fileName);
  }

  void saveFile() {
    if (file != "") {
      eventManager.notify("save", file);
    }
  }

}
