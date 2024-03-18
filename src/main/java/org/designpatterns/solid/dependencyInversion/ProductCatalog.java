package org.designpatterns.solid.dependencyInversion;

import java.util.List;

public class ProductCatalog {

  public void listAllProducts() {
    ProductRepository productRepository = new SQLProductRepository();
    List<String> productNames = productRepository.getAllProductNames();
    productNames.forEach(System.out::println);
  }

}
