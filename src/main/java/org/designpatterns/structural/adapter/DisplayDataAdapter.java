package org.designpatterns.structural.adapter;

import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter {

  @Override
  public List<DisplayExternalData> convertData(List<DatabaseData> data) {
    return data
        .stream()
        .map(d -> new DisplayExternalData((float) d.position, String.valueOf(d.amount)))
        .toList();
  }

}
