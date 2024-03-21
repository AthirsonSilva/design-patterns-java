package org.designpatterns.creational.singleton;

public class SingletonEager {

    private final static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
