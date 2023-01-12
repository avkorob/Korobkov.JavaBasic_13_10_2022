package com.hillel.korobkov.homeworks.homework15;

public class Iphone implements Smartphones, IOS {

    private String name;

    public Iphone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void iOS() {
        System.out.println("iOS");
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void sms() {
        System.out.println("sms");
    }

    @Override
    public void internet() {
        System.out.println("internet");
    }

    public void printInfo2() {
        System.out.println(getName() + " has:");
    }
}