package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int gamesQuantity = 1000;
        HashMap<Integer, Boolean> games = new HashMap<>();
        for (int i = 0; i < gamesQuantity; i++) {
            LetsMakeDealGame game = new LetsMakeDealGame(3);
            games.put(i, game.play());
        }
        printResults(games, gamesQuantity);
    }

    private static void printResults(HashMap<Integer, Boolean> games, int gamesQuantity){
        int wins = (int) games.values().stream().filter(value -> value).count();
        int losses = gamesQuantity - wins;
        double winPercent = (double) wins/gamesQuantity*100;
        System.out.printf("Total games: %d, wins: %d, losses: %d, general win percent is: %.2f%%\n",
                gamesQuantity, wins, losses, winPercent);
    }
}