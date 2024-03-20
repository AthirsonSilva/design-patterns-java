package org.designpatterns.prototype;

public abstract class Vehicle {

    public int wheels;

    public long price;

    public Vehicle() {

    }

    public Vehicle(Vehicle target) {
        if (target == null) {
            return;
        }

        this.wheels = target.wheels;
        this.price = target.price;
    }

    public abstract Vehicle clone();

    public abstract Boolean isClone(Vehicle vehicle);


}
