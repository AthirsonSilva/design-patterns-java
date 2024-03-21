package org.designpatterns.structural.bridge;

public class IOS implements PhoneOS {

  @Override
  public void display(String data) {
    System.out.println("IOS displaying data => " + data);
  }

  @Override
  public void download(String url) {
    System.out.println("IOS downloading from url => " + url);
  }

  @Override
  public void upload(String data) {
    System.out.println("IOS uploading data => " + data);
  }

}
