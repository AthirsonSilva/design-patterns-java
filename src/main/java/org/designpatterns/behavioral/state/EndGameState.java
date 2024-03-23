package org.designpatterns.behavioral.state;

public class EndGameState extends State {

  public EndGameState(Game game) {
    super(game);
    System.out.println("Game in End Game State");
  }

  @Override
  public void onBreak() {
    System.out.println("Not allowed");
  }

  @Override
  public void onEndGame() {
    System.out.println("Already in End Game State");
  }

  @Override
  public void onPlaying() {
    System.out.println("Not allowed");
  }

  @Override
  public void onWelcomeScreen() {
    game.setState(new WelcomeState(game));
  }

}
