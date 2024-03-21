package org.designpatterns.creational.prototype;

public class ClientTests {

    public static void main(String[] args) {
        Vehicle car = new Car(4, 10000, "blue");
        Vehicle clone = car.clone();
        System.out.println(car.isClone(clone));

        Vehicle bicycle = new Bicycle(2, 2000, true);
        Vehicle clone2 = bicycle.clone();
        System.out.println(bicycle.isClone(clone2));

        System.out.println(car.isClone(bicycle));
    }

}
