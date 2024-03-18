package org.designpatterns.solid.liskovSubstitution;

import java.util.List;

public class PrincipingCalculator {

  public static void main(String[] args) {
    var p1 = new Product();
    var p2 = new Product();
    var p3 = new InHouseProduct();

    List<Product> products = List.of(p1, p2, p3);

    products.forEach(
        p -> System.out.println(p.getDiscount()));
  }

}
