package org.designpatterns.structural.composite;

import java.util.ArrayList;

public class Composite extends Equipment {

  private ArrayList<Equipment> equipments = new ArrayList<>();

  public Composite(String name) {
    super(name, 0);
  }

  public Composite add(Equipment equipment) {
    this.equipments.add(equipment);
    return this;
  }

  @Override
  public Integer getPrice() {
    int sum = 0;

    for (var equipment : equipments) {
      sum += equipment.getPrice();
    }

    return sum;
  }

}
