package org.example;

import java.util.Random;

/**
 * Шоу Монти Холла
 */
public class LetsMakeDealGame {
    Player player;
    MontyHall montyHall;
    private final boolean[] doors;
    private int correctDoor;

    /**
     * @param doorsQuantity кол-во дверей в игре
     */
    public LetsMakeDealGame(int doorsQuantity) {
        this.doors = new boolean[doorsQuantity];
        init();
        player = new Player(doorsQuantity);
        montyHall = new MontyHall(correctDoor, doorsQuantity);
    }

    /**
     * Метод задания правильной двери
     */
    private void init() {
        Random random = new Random();
        int correctDoorIndex = random.nextInt(doors.length);
        doors[correctDoorIndex] = true;
        correctDoor = correctDoorIndex;
    }

    /**
     * Метод прохождения игры
     *
     * @return выйграл ли игрок ? true : false
     */
    public boolean play() {
        player.makeChoice();
        int openedWrongDoor = montyHall.openWrongDoor(player.getFirstChoice());
        player.remakeChoice(openedWrongDoor);
        return doors[player.getSecondChoice()];
    }
}

