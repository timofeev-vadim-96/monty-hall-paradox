package org.example;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * Класс ведущего игры
 */
@AllArgsConstructor
public class MontyHall {
    int correctDoor;
    int doorsQuantity;

    /**
     * Метод открытия ошибочной двери
     *
     * @param firstPlayerChoice первый выбор игрока
     * @return возвращает ошибочную дверь, исключая выбор игрока
     */
    public int openWrongDoor(int firstPlayerChoice) {
        Random random = new Random();
        int wrongDoor;
        do {
            wrongDoor = random.nextInt(doorsQuantity);
        } while (wrongDoor == firstPlayerChoice || wrongDoor == correctDoor);
        return wrongDoor;
    }
}
