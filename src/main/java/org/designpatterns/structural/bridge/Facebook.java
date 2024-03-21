package org.designpatterns.structural.bridge;

public class Facebook implements App {

  private PhoneOS os;

  public Facebook(PhoneOS os) {
    this.os = os;
  }

  @Override
  public void run() {
    System.out.println();
    os.upload("Facebook data");
    os.display("Facebook data");
    os.download("Facebook url");
    System.out.println();
  }

}
