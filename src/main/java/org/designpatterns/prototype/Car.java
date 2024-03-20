package org.designpatterns.prototype;

public class Car extends Vehicle {

    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);

        if (target != null) {
            color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public Boolean isClone(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            return color.equals(car.color) && wheels == car.wheels && price == car.price;
        }

        return false;
    }

}
