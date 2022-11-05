package com.hillel.korobkov.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

        int userNumber, unknownNumber;
        unknownNumber = (int) (Math.random() * 10) + 1;
        System.out.println(unknownNumber);
        System.out.println("Комп'ютер загадав число від 0 до 10! Спробуй вгадати!");
        System.out.println("Введи число від 0 до 10! (У тебе є три спроби):");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == unknownNumber) {
                    System.out.println("Вітаю! Ти вгадав, компь'ютер загадав число: " + unknownNumber);
                    break;
                } else {
                    System.out.println("Ти не вгадав! У тебе залишилось 2 спроби! ");
                }
            } else {
                System.out.println("Помилка! Необхідно число від 0 до 10!");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == unknownNumber) {
                    System.out.println("Вітаю! Ти вгадав, компь'ютер загадав число: " + unknownNumber);
                    break;
                } else {
                    System.out.println("Ти не вгадав! У тебе залишилось 1 спроба! ");
                }
            } else {
                System.out.println("Помилка! Необхідно число від 0 до 10!");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == unknownNumber) {
                    System.out.println("Вітаю! Ти вгадав, компь'ютер загадав число: " + unknownNumber);
                    break;
                } else {
                    System.out.println("Ти не вгадав! Спробуй ще!");
                }
                break;
            } else {
                System.out.println("Помилка! Необхідно число від 0 до 10!");
                scanner.nextLine();
            }
        }
    }
}
