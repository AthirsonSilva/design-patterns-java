package org.designpatterns.structural.flyweight;

import java.util.Random;

public class Client {

  public static void main(String[] args) {
    int fightersToDraw = 300;
    Army army = new Army();
    FighterRank currentRank;
    Random random = new Random();

    for (int i = 0; i < fightersToDraw; i++) {
      switch (random.nextInt(3)) {
        case 0:
          currentRank = FighterRank.PRIVATE;
          break;
        case 1:
          currentRank = FighterRank.SERGEANT;
          break;
        case 2:
          currentRank = FighterRank.MAJOR;
          break;
        default:
          currentRank = FighterRank.PRIVATE;
          break;
      }
      army.spawnFigther(currentRank);
    }

    army.drawArmy();
  }

}
