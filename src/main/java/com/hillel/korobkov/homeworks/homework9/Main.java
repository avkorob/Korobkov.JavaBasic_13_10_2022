package com.hillel.korobkov.homeworks.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        final int counter = 25;
        int[] team1 = new int[counter];
        int[] team2 = new int[counter];
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < counter; i++) {
            team1[i] = (int) (18 + (Math.random() * 23));
            team2[i] = (int) (18 + (Math.random() * 23));
            sum1 += team1[i];
            sum2 += team2[i];
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        System.out.println("середній вік гравців першої команди  : " + (sum1 / counter));
        System.out.print("середній вік гравців другої команди  : " + (sum2 / counter));

    }
}


