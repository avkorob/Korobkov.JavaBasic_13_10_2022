package com.hillel.korobkov.homeworks.homework17;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();

    }

    private static void runApp() {
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        int coffeeCounter = 0;
        int teaCounter = 0;
        int lemonadeCounter = 0;
        int mojitoCounter = 0;
        int waterCounter = 0;
        int cokeCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Обери напій зі списку: " + Arrays.toString(drinksMachines) + " або натисніть STOP");

        while (true) {
            String userInput = scanner.nextLine().toUpperCase();
            if (userInput == null || userInput.equals("STOP")) {
                break;
            }
            DrinksMachine userDrink = null;
            for (int i = 0; i < DrinksMachine.values().length; i++) {
                String userInputUpperCase = userInput.toUpperCase();
                if (DrinksMachine.values()[i].toString().equals(userInputUpperCase)) {
                    userDrink = DrinksMachine.valueOf(userInputUpperCase);
                    break;
                }
            }
            if (userDrink == null) {
                System.out.println("Напою " + userInput + " немає в асортименті");
                continue;
            }

            switch (userDrink) {
                case COFFEE: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.COFFEE);
                    coffeeCounter++;
                    continue;
                }
                case TEA: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.TEA);
                    teaCounter++;
                    continue;
                }
                case WATER: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.WATER);
                    waterCounter++;
                    continue;
                }
                case COKE: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.COKE);
                    cokeCounter++;
                    continue;
                }
                case MOJITO: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.MOJITO);
                    mojitoCounter++;
                    continue;
                }
                case LEMONADE: {
                    System.out.println("Обраний напій: " + userDrink.getType() + " Сума: " + Drinks.LEMONADE);
                    lemonadeCounter++;
                }
            }
        }
        int totalCounter = coffeeCounter + teaCounter + lemonadeCounter + mojitoCounter + waterCounter + cokeCounter;
        int totalPrice = coffeeCounter * Drinks.COFFEE
                + teaCounter * Drinks.TEA
                + lemonadeCounter * Drinks.LEMONADE
                + mojitoCounter * Drinks.MOJITO
                + waterCounter * Drinks.WATER
                + cokeCounter * Drinks.COKE;
        System.out.println("Було замовлено:  " + totalCounter + "\n" + "Сума до сплати: " + totalPrice);
    }
}