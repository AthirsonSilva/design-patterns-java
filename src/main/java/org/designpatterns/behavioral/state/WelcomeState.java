package org.designpatterns.behavioral.state;

public class WelcomeState extends State {

  public WelcomeState(Game game) {
    super(game);
    System.out.println("Game in Welcome State");
  }

  @Override
  public void onBreak() {
    System.out.println("Not allowed");
  }

  @Override
  public void onEndGame() {
    System.out.println("Not allowed");
  }

  @Override
  public void onPlaying() {
    game.setState(new PlayingState(game));
  }

  @Override
  public void onWelcomeScreen() {
    System.out.println("Welcome to the game");
  }

}
