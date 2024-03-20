package org.designpatterns.factory;

public class ShapeFactory {

  public Shape getFood(ShapeOptions type) {
    if (type == null) {
      return null;
    }

    switch (type) {
      case ROUND:
        return new Pizza();
      case CYLINDER:
        return new Burrito();
      default:
        throw new IllegalArgumentException("Invalid type: " + type);
    }
  }

}
