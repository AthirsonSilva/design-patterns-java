package org.designpatterns.creational.singleton;

public class SingletonStaticBlock {

  private final static SingletonStaticBlock instance;

  static {
    instance = new SingletonStaticBlock();
  }

  public static SingletonStaticBlock getInstance() {
    return instance;
  }

}
