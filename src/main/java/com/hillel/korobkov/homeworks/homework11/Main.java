package com.hillel.korobkov.homeworks.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scan;
        int scan2;

        System.out.println("Ведіть розмір рядків (М): ");
        while (true) {
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                if (scan > 1) {
                    System.out.println("Ваше число: " + scan);
                    break;
                } else {
                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ПОЗИТИВНЕ ЧИСЛО > 1");
                }
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ПОЗИТИВНО ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Ведіть розмір стовпців (N). Число повинно бути однаковим з рядком");

        while (true) {
            if (scanner.hasNextInt()) {
                scan2 = scanner.nextInt();
                if (scan2 == scan) {
                    System.out.println("Ваше число: " + scan2);
                    break;
                } else {
                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. РЯДКИ ТА СТОВПЦІ НЕ ОДНАКОВІ");
                }
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        int[][] array = new int[scan][scan2];
        System.out.println("Створено масив: " + scan + " на " + scan2);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Траснпонування матриці");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int array2 = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = array2;
            }
        }
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
