package org.example;

import lombok.Getter;

import java.util.Random;

/**
 * Класс участника шоу
 */
public class Player {
    @Getter
    private int firstChoice;
    @Getter
    private int secondChoice;
    private final Random random;
    private final int doorsQuantity;

    /**
     * @param doorsQuantity количество дверей в игре
     */
    public Player(int doorsQuantity) {
        this.random = new Random();
        this.doorsQuantity = doorsQuantity;
    }

    /**
     * Метод для первого выбора игрока
     */
    public void makeChoice() {
        firstChoice = random.nextInt(doorsQuantity);
    }

    /**
     * Метод выбора оставшейся двери
     *
     * @param wrongDoor неправильная дверь, открытая ведущим
     */
    public void remakeChoice(int wrongDoor) {
        do {
            secondChoice = random.nextInt(doorsQuantity);
        } while (secondChoice == wrongDoor || secondChoice == firstChoice);
    }
}
