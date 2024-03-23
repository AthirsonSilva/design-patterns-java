package org.designpatterns.behavioral.state;

public class PlayingState extends State {

  public PlayingState(Game game) {
    super(game);
    System.out.println("Game in Playing State");
  }

  @Override
  public void onBreak() {
    game.setState(new BreakState(game));
  }

  @Override
  public void onEndGame() {
    game.setState(new EndGameState(game));
  }

  @Override
  public void onPlaying() {
    System.out.println("Already playing");
  }

  @Override
  public void onWelcomeScreen() {
    System.out.println("Not allowed");
  }

}
