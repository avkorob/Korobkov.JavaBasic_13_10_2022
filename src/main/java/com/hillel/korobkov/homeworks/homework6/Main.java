package com.hillel.korobkov.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Введеня даних для першої команди
        int frag11 = 0;
        int frag12 = 0;
        int frag13 = 0;
        int frag14 = 0;
        int frag15 = 0;

        int frag21 = 0;
        int frag22 = 0;
        int frag23 = 0;
        int frag24 = 0;
        int frag25 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ім'я першої команди:");
        String name1 = sc.nextLine();

        System.out.println("Введіть кількість фрагів для першого гравця першої команди");
        if (sc.hasNextInt()) {
            frag11 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для другого гравця першої команди");
        if (sc.hasNextInt()) {
            frag12 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для третього гравця першої команди");
        if (sc.hasNextInt()) {
            frag13 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для четвертого гравця першої команди");
        if (sc.hasNextInt()) {
            frag14 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для п'ятого гравця першої команди");
        if (sc.hasNextInt()) {
            frag15 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        //      Введеня даних для другої команди

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введіть ім'я другої команди:");
        String name2 = sc1.nextLine();
        System.out.println("Введіть кількість фрагів для першого гравця другої команди");
        if (sc.hasNextInt()) {
            frag21 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для другого гравця другої команди");
        if (sc.hasNextInt()) {
            frag22 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для третього гравця другої команди");
        if (sc.hasNextInt()) {
            frag23 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для четвертого гравця другої команди");
        if (sc.hasNextInt()) {
            frag24 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів для п'ятого гравця другої команди");
        if (sc.hasNextInt()) {
            frag25 = sc.nextInt();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }
//        Результат
        System.out.println("Ви ввели наступні дані для першої команди:");
        System.out.println("Назва команди: " + name1 + ";");
        System.out.println("Кількість фрагів для гравця 1: " + frag11);
        System.out.println("Кількість фрагів для гравця 2: " + frag12);
        System.out.println("Кількість фрагів для гравця 3: " + frag13);
        System.out.println("Кількість фрагів для гравця 4: " + frag14);
        System.out.println("Кількість фрагів для гравця 5: " + frag15);

        System.out.println("Ви ввели наступні дані для другої команди:");
        System.out.println("Назва команди: " + name2 + ";");
        System.out.println("Кількість фрагів для гравця 1: " + frag21);
        System.out.println("Кількість фрагів для гравця 2: " + frag22);
        System.out.println("Кількість фрагів для гравця 3: " + frag23);
        System.out.println("Кількість фрагів для гравця 4: " + frag24);
        System.out.println("Кількість фрагів для гравця 5: " + frag25);

        double result1 = (frag11 + frag12 + frag13 + frag14 + frag15) / 5.0;
        double result2 = (frag21 + frag22 + frag23 + frag24 + frag25) / 5.0;

        System.out.println("Результати гри:");
        if (result1 > result2) {
            System.out.println("Перемогла команда: " + name1 + ", набрала: " + result1 + " очка(ів)");
        } else if (result1 < result2) {
            System.out.println("Перемогла команда: " + name2 + ", набрала: " + result2 + " очка(ів)");
        } else
            System.out.println("Нічия, перемогла дружба!!!");
    }
}
