package com.hillel.korobkov.homeworks.homework17;

enum DrinksMachine {

    COFFEE("КАВА"),
    TEA("ЧАЙ"),
    LEMONADE("ЛИМОНАД"),
    MOJITO("МОХІТО"),
    WATER("МІНЕРАЛЬНА ВОДА"),
    COKE("КОКА-КОЛА");


    private String type;

    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}