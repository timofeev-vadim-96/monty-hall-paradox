package org.example;

public class Main {
    public static void main(String[] args) {
        double winsCounter = 0;
        int gamesQuantity = 1000;
        for (int i = 0; i < gamesQuantity; i++) {
            LetsMakeDealGame game = new LetsMakeDealGame(3);
            if (game.play()) winsCounter++;
        }
        double winPercent = winsCounter/gamesQuantity*100;
        System.out.printf("General win percent is: %.2f%%\n", winPercent);
    }
}