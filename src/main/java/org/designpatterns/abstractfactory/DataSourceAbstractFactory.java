package org.designpatterns.abstractfactory;

public interface DataSourceAbstractFactory {

  public Service createService();

  public Response createResponse();

}
