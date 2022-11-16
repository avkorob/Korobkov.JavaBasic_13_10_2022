package com.hillel.korobkov.homeworks.homework1;

public class Main {
    public static void main(String[] args) {
        int n, j;
        j = 0;
        for (int i = 1; i < 100000; i++) {
            n = i;
            while (n != 0) {
                if (n % 10 == 4 || n % 100 + 10 * n % 10 == 13) {
                    j++;
                    break;
                }
                n = n / 10;
            }
        }
        System.out.println("Iscluchit nomerov: " + j);
    }
}
