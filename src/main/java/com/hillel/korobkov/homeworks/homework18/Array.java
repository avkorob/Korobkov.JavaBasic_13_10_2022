package com.hillel.korobkov.homeworks.homework18;


public class Array {

    public static double arrayMean(int[] array) {

        double average;
        int sum = 0;

        if (array == null || array.length == 0) {
            return 0;
        }

        for (int j : array) {
            sum += j;
        }

        average = sum / array.length;
        return average;
    }

    public static boolean arraySquare(int[][] array) {
        double check = 0;
        if (array == null || array.length == 0) {
            return false;
        }

        for (int[] ints : array) {
            if (ints == null || ints.length == 0) {
                return false;
            }
            check += ints.length;
        }

        check = check / (double) array.length;
        return check == array.length;

    }
}