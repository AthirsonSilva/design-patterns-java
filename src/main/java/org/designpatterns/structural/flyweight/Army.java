package org.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {

  private List<Fighter> army = new ArrayList<>();

  public void spawnFigther(FighterRank rank) {
    Fighter newFigther = FighterFactory.getFigther(rank);
    army.add(newFigther);
  }

  public void drawArmy() {
    army.forEach(
        figther -> {
          switch (figther.getRank()) {
            case PRIVATE:
              System.out.println("Drawing private");
              break;
            case SERGEANT:
              System.out.println("Drawing sergeant");
              break;
            case MAJOR:
              System.out.println("Drawing major");
              break;
            default:
              break;
          }
        });
  }

}
