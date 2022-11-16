package com.hillel.korobkov.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

        int counter = 0;
        for (int i = 10; i <= 163; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14) {
            continue;
            }
            System.out.println("Номер шатлу: " + i);
            counter++;

        }
        System.out.print("Всього пронумеровано шатлів: ");
        System.out.println(counter);


    }
}
