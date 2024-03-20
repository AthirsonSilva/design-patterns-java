package org.designpatterns.builder;

public class ApartmentBuilder {

  private Integer sqm = 0;
  private Integer rooms = 0;
  private Integer floor = 0;
  private String city = "";
  private String area = "";
  private Boolean hasKitchen = false;

  public Apartment build() {
    Apartment apartment = new Apartment(sqm, rooms, floor, city, area, hasKitchen);
    sqm = 0;
    rooms = 0;
    floor = 0;
    city = "";
    area = "";
    hasKitchen = false;
    return apartment;
  }

  public ApartmentBuilder setSqm(Integer sqm) {
    this.sqm = sqm;
    return this;
  }

  public ApartmentBuilder setRooms(Integer rooms) {
    this.rooms = rooms;
    return this;
  }

  public ApartmentBuilder setFloor(Integer floor) {
    this.floor = floor;
    return this;
  }

  public ApartmentBuilder setCity(String city) {
    this.city = city;
    return this;
  }

  public ApartmentBuilder setArea(String area) {
    this.area = area;
    return this;
  }

  public ApartmentBuilder setHasKitchen(Boolean hasKitchen) {
    this.hasKitchen = hasKitchen;
    return this;
  }

}
