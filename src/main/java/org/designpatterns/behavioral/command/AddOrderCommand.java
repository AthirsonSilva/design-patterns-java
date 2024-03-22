package org.designpatterns.behavioral.command;

public class AddOrderCommand implements Command {

  private Integer id;
  private Double price;

  public AddOrderCommand(Integer id, Double price) {
    this.id = id;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public void execute() {
    System.out.println("Order added with id: " + id + " and price: " + price);
  }

}
