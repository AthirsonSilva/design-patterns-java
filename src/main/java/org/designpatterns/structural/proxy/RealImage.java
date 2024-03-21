package org.designpatterns.structural.proxy;

public class RealImage implements Image {

  private String fileName;

  public RealImage(String fileName) {
    System.out.println("Loading file =>" + fileName);
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    System.out.println("Displaying file => " + fileName);
  }

}
