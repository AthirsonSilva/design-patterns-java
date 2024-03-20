package org.designpatterns.abstractfactory;

public class DatabaseFactory implements DataSourceAbstractFactory {

  @Override
  public Response createResponse() {
    return new DatabaseResponse();
  }

  @Override
  public Service createService() {
    return new DatabaseService();
  }

}
