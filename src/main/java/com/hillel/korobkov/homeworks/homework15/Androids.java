package com.hillel.korobkov.homeworks.homework15;

public class Androids implements Smartphones, LinuxOS {

    private String name;

    public Androids(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void LinuxOS() {
        System.out.println("LinuxOS");
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

    public void printInfo() {
        System.out.println(getName() + " has:");
    }
}
