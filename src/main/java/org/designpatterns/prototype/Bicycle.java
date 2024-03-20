package org.designpatterns.prototype;

public class Bicycle extends Vehicle {

    private Boolean cityBike;

    public Bicycle(int wheels, long price, Boolean cityBike) {
        this.wheels = wheels;
        this.price = price;
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);

        if (target != null) {
            cityBike = target.cityBike;
        }
    }


    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public Boolean isClone(Vehicle vehicle) {
         if (vehicle instanceof Bicycle bicycle) {
            return cityBike == bicycle.cityBike && wheels == bicycle.wheels && price == bicycle.price;
        }

        return false;
    }
}
