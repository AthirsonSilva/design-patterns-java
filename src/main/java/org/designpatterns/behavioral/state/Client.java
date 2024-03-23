package org.designpatterns.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;

public class Client {

  public static void main(String[] args) {
    Game game = new Game();
    BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
    String input = "";

    do {
      System.out.print("Enter command: ");
      try {
        input = reader.readLine().trim().toLowerCase();
        switch (input) {
          case "w":
            game.setState(new WelcomeState(game));
            break;
          case "p":
            game.setState(new PlayingState(game));
            break;
          case "b":
            game.setState(new BreakState(game));
            break;
          case "e":
            game.setState(new EndGameState(game));
            break;
          default:
            System.out.println("Invalid command");
            break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } while (input != "exit");
  }

}
