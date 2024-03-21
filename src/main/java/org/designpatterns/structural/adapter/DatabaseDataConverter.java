package org.designpatterns.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {

  public List<DisplayExternalData> convertData(List<DatabaseData> data);

}
