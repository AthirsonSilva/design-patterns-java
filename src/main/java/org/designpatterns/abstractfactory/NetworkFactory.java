package org.designpatterns.abstractfactory;

public class NetworkFactory implements DataSourceAbstractFactory {

  @Override
  public Response createResponse() {
    return new NetworkResponse();
  }

  @Override
  public Service createService() {
    return new NetworkService();
  }

}
