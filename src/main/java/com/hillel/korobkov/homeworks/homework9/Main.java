package com.hillel.korobkov.homeworks.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (18 + (Math.random() * 23));
        }
        System.out.println(Arrays.toString(team1));
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (18 + (Math.random() * 23));
        }
        System.out.println(Arrays.toString(team2));

        int sum1 = 0;
        int sum2 = 0;

        for (int j : team1) {
            sum1 = sum1 + j;
        }
        System.out.println("середній вік гравців першої команди  : " + (sum1 / team1.length));

        for (int i = 0; i < team2.length; i++) {
            sum2 = sum2 + team2[i];
        }
        System.out.println("середній вік гравців другої команди  : " + (sum2 / team2.length));

    }
}


