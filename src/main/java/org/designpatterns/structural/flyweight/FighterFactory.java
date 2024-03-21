package org.designpatterns.structural.flyweight;

import java.util.Map;

public class FighterFactory {

  private static Map<FighterRank, Fighter> fighters = Map.of(
      FighterRank.PRIVATE, new Fighter(FighterRank.PRIVATE),
      FighterRank.SERGEANT, new Fighter(FighterRank.SERGEANT),
      FighterRank.MAJOR, new Fighter(FighterRank.MAJOR));

  public static Fighter getFigther(FighterRank rank) {
    if (!fighters.containsKey(rank)) {
      fighters.put(rank, new Fighter(rank));
    }
    return fighters.get(rank);
  }

}
