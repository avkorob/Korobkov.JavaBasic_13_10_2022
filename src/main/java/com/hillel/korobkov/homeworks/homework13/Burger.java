package com.hillel.korobkov.homeworks.homework13;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Состав бургеру: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Состав бургеру: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Состав бургеру: " + bun + ", " + doubleMeat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

}



