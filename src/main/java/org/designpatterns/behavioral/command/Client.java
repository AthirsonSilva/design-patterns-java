package org.designpatterns.behavioral.command;

public class Client {

  public static void main(String[] args) {
    CommandProcesser commandProcesser = new CommandProcesser();
    commandProcesser
        .addCommand(new AddOrderCommand(1, 100.0))
        .addCommand(new AddOrderCommand(2, 200.0))
        .addCommand(new OrderExecuteCommand(1, 100.0))
        .addCommand(new OrderExecuteCommand(2, 200.0))
        .processCommands();
  }

}
