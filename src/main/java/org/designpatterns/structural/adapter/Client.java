package org.designpatterns.structural.adapter;

import java.util.List;

public class Client {

  public static void main(String[] args) {
    DatabaseDataGenerator dataGenerator = new DatabaseDataGenerator();
    DisplayDataAdapter displayDataAdapter = new DisplayDataAdapter();

    List<DatabaseData> data = dataGenerator.generateData();
    List<DisplayExternalData> displayData = displayDataAdapter.convertData(data);

    displayData.forEach(DisplayExternalData::displayData);
  }

}
