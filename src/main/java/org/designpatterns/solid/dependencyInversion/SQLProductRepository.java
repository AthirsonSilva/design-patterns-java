package org.designpatterns.solid.dependencyInversion;

import java.util.List;

public class SQLProductRepository implements ProductRepository {

  @Override
  public List<String> getAllProductNames() {
    return List.of("Product 1", "Product 2", "Product 3");
  }

}
