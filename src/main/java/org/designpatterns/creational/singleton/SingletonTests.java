package org.designpatterns.creational.singleton;

public class SingletonTests {

    public static void main(String[] args) {
        singletonThreadSafe();
    }

    private static void singletonEager() {
        SingletonEager instance1 = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static void singletonStaticBlock() {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static void singletonLazy() {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static void singletonThreadSafe() {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static void singletonBillPugh() {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();
        System.out.println(instance1 == instance2);
    }

}
