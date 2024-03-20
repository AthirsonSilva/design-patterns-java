package org.designpatterns.factory;

public class FactoryTests {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape pizza = shapeFactory.getFood(ShapeOptions.ROUND);
    Shape burrito = shapeFactory.getFood(ShapeOptions.CYLINDER);

    System.out.println(pizza.getShape());
    System.out.println(burrito.getShape());

    try {
      Shape food = shapeFactory.getFood(null);
      System.out.println(food.getShape());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
