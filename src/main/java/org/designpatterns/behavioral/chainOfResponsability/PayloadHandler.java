package org.designpatterns.behavioral.chainOfResponsability;

public class PayloadHandler implements HandlerChain {

  private String payload;
  public HandlerChain next;

  public PayloadHandler(String payload) {
    this.payload = payload;
  }

  @Override
  public String addHandler(String inputHeader) {
    var outputHeader = String.format("%s %s\n", "Payload", payload);
    if (next == null)
      return outputHeader;
    return next.addHandler(outputHeader);
  }

}
