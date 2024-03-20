package org.designpatterns.builder;

public class Apartment {

  private Integer sqm;
  private Integer rooms;
  private Integer floor;
  private String city;
  private String area;
  private Boolean hasKitchen;

  public Integer getSqm() {
    return sqm;
  }

  public void setSqm(Integer sqm) {
    this.sqm = sqm;
  }

  public Integer getRooms() {
    return rooms;
  }

  public void setRooms(Integer rooms) {
    this.rooms = rooms;
  }

  public Integer getFloor() {
    return floor;
  }

  public void setFloor(Integer floor) {
    this.floor = floor;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public Boolean getHasKitchen() {
    return hasKitchen;
  }

  public void setHasKitchen(Boolean hasKitchen) {
    this.hasKitchen = hasKitchen;
  }

  public Apartment(Integer sqm, Integer rooms, Integer floor, String city, String area, Boolean hasKitchen) {
    this.sqm = sqm;
    this.rooms = rooms;
    this.floor = floor;
    this.city = city;
    this.area = area;
    this.hasKitchen = hasKitchen;
  }

  @Override
  public String toString() {
    return "Apartment [sqm=" + sqm + ", rooms=" + rooms + ", floor=" + floor + ", city=" + city + ", area=" + area
        + ", hasKitchen=" + hasKitchen + "]";
  }

}
