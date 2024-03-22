package org.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcesser {

  private List<Command> commands = new ArrayList<>();

  public CommandProcesser addCommand(Command command) {
    commands.add(command);
    return this;
  }

  public void processCommands() {
    commands.forEach(Command::execute);
  }

}
