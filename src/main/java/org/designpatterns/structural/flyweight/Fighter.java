package org.designpatterns.structural.flyweight;

public class Fighter implements Sprite {

  private FighterRank rank;

  public Fighter(FighterRank rank) {
    this.rank = rank;
  }

  @Override
  public void draw() {
    System.out.println("Drawing fighter");
  }

  @Override
  public void move(int x, int y) {

    System.out.printf("Moving fighter at (%d, %d)\n", x, y);
  }

  public FighterRank getRank() {
    return rank;
  }

  public void setRank(FighterRank rank) {
    this.rank = rank;
  }

}