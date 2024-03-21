package org.designpatterns.creational.abstractfactory;

public interface DataSourceAbstractFactory {

  public Service createService();

  public Response createResponse();

}
