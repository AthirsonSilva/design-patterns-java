package org.designpatterns.structural.facade;

public class NetworkAccessFacade {

  private Communicator comm = new Communicator();
  private Cache cache = new Cache();
  private Interceptor interceptor = new Interceptor();
  private Converter converter = new Converter();

  public void communicate() {
    comm.send("data");
    cache.cache();
    interceptor.intercept();
    converter.convert();
    comm.receive();
  }

}
