package org.designpatterns.singleton;

public class SingletonThreadSafe {

  private static SingletonThreadSafe singletonThreadSafe;

  private SingletonThreadSafe() {

  }

  public synchronized static SingletonThreadSafe getInstance() {
    if (singletonThreadSafe == null) {
      singletonThreadSafe = new SingletonThreadSafe();
    }

    return singletonThreadSafe;
  }

}
