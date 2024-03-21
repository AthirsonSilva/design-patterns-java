package org.designpatterns.structural.adapter;

public class DisplayExternalData {

  public float index;
  public String data;

  public DisplayExternalData(float index, String data) {
    this.index = index;
    this.data = data;
  }

  public void displayData() {
    System.out.println("Index: " + index + " Data: " + data);
  }

}
