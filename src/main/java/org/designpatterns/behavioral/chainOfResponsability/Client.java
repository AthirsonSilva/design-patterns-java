package org.designpatterns.behavioral.chainOfResponsability;

public class Client {

  public static void main(String[] args) {
    var authenticationHandler = new AuthenticationHandler("verySecretToken");
    var contentTypeHandler = new ContentTypeHandler("application/json");
    var payloadHandler = new PayloadHandler("{\"contentType\":\"json\"}");

    authenticationHandler.next = contentTypeHandler;
    contentTypeHandler.next = payloadHandler;

    var withAuth = authenticationHandler.addHandler("Headers with authentication");
    System.out.println(withAuth);

    var withoutAuth = authenticationHandler.addHandler("Headers without authentication");
    System.out.println(withoutAuth);
  }

}
