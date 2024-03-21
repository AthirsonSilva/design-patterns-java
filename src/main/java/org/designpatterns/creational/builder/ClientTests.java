package org.designpatterns.creational.builder;

public class ClientTests {

  public static void main(String[] args) {
    Apartment apartment = new ApartmentBuilder()
        .setArea("Roma")
        .setCity("Roma")
        .setFloor(1)
        .setHasKitchen(true)
        .setRooms(3)
        .build();

    System.out.println(apartment);
  }

}
