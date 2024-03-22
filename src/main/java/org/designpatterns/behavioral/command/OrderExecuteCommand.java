package org.designpatterns.behavioral.command;

public class OrderExecuteCommand implements Command {

  private Integer id;
  private Double price;

  public OrderExecuteCommand(Integer id, Double price) {
    this.id = id;
    this.price = price;
  }

  @Override
  public void execute() {
    System.out.println("Order executed with id: " + id + " and price: " + price);
  }

}
