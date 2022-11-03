package com.hillel.korobkov.homeworks.homework7;

public class Main {
    public static void main(String[] args) {
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

        int counter = 0;
        for (int i = 10; i <= 153; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println("shuttle number: " + i);
            counter++;
        }

        System.out.println(counter);

    }
}
