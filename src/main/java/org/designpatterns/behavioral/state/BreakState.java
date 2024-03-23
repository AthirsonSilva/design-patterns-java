package org.designpatterns.behavioral.state;

public class BreakState extends State {

  public BreakState(Game game) {
    super(game);
    System.out.println("Game in Break State");
  }

  @Override
  public void onBreak() {
    System.out.println("Already in break");
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
    System.out.println("Not allowed");
  }

}
