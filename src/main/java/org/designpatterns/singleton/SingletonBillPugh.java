package org.designpatterns.singleton;

public class SingletonBillPugh {

  private SingletonBillPugh() {

  }

  private static class InnerStaticClass {
    private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
  }

  public static SingletonBillPugh getInstance() {
    return InnerStaticClass.INSTANCE;
  }

}
