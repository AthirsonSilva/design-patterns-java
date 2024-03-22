package org.designpatterns.behavioral.chainOfResponsability;

public class ContentTypeHandler implements HandlerChain {

  private String contentType;
  public HandlerChain next;

  public ContentTypeHandler(String contentType) {
    this.contentType = contentType;
  }

  @Override
  public String addHandler(String inputHeader) {
    var outputHader = String.format("%s %s\n", "Content-Type", contentType);
    if (next == null)
      return outputHader;
    return next.addHandler(outputHader);
  }

}
