package com.hillel.korobkov.homeworks.homework14;

public class FitnessMain {

    public static void main(String[] args) {

        Fitness account1 = new Fitness("Oksana", "Ivanova", 25, 12, 1988,
                "oivanova@gmail.com", 380991401010l, 85, "180/60", 7550);

        Fitness account2 = new Fitness("Petr", "Petrov", 25, 11, 1990,
                "ppetrov@gmail.com", 380934523658l, 77.66, "180/60", 10200);

        Fitness account3 = new Fitness("Andrey", "Nechay", 13, 9, 1974,
                "anechay@gmail.com", 380937778523l, 65.2525, "180/60", 9500);

        Fitness account4 = new Fitness("Vladimir", "Sidorov", 30, 01, 1962,
                "vsidorov@gmail.com", 380675231419l, 100, "190/60", 5350);

        account1.printAccountInfo();
        account2.printAccountInfo();
        account3.printAccountInfo();
        account4.printAccountInfo();

    }
}