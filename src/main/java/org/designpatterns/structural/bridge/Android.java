package org.designpatterns.structural.bridge;

public class Android implements PhoneOS {

  @Override
  public void display(String data) {
    System.out.println("Android displaying data => " + data);
  }

  @Override
  public void download(String url) {
    System.out.println("Android downloading from url => " + url);
  }

  @Override
  public void upload(String data) {
    System.out.println("Android uploading data => " + data);
  }

}
