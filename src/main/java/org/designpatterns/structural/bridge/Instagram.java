package org.designpatterns.structural.bridge;

public class Instagram implements App {

  private PhoneOS os;

  @Override
  public void run() {
    System.out.println();
    os.upload("Instagram data");
    os.display("Instagram data");
    os.download("Instagram url");
    System.out.println();
  }

}
