package org.designpatterns.behavioral.chainOfResponsability;

public class AuthenticationHandler implements HandlerChain {

  private String token;
  public HandlerChain next;

  public AuthenticationHandler(String token) {
    this.token = token;
  }

  @Override
  public String addHandler(String inputHeader) {
    var outputHeader = String.format("%s %s\n", "Authentication", token);
    if (next == null)
      return outputHeader;
    return next.addHandler(outputHeader);
  }

}
