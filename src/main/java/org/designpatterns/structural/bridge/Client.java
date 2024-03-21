package org.designpatterns.structural.bridge;

public class Client {

  public static void main(String[] args) {
    App facebookOnAndroid = new Facebook(new IOS());
    App facebookOnIOS = new Facebook(new Android());
    facebookOnAndroid.run();
    facebookOnIOS.run();

    App instagramOnAndroid = new Facebook(new Android());
    App instagramOnIOS = new Facebook(new IOS());
    instagramOnAndroid.run();
    instagramOnIOS.run();
  }

}
