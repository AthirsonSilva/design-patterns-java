package org.designpatterns.structural.adapter;

import java.util.List;

public class DatabaseDataGenerator {

  public List<DatabaseData> generateData() {
    return List.of(
        new DatabaseData(1, 2),
        new DatabaseData(3, 4),
        new DatabaseData(5, 6));
  }

}
