package com.hillel.korobkov.homeworks.homework14;

public class Fitness {
    private final String name;
    private String lastname;
    private final int number;
    private final int month;
    private final int year;
    private final String email;
    private final long phone;
    private double weigh;
    private String pressure;
    private int steps;
    private int a = 2020;
    private int age;

    public Fitness(String name, String lastname, int number, int month, int year, String email, long phone,
                   double weigh, String pressure, int steps) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.weigh = weigh;
        this.pressure = pressure;
        this.steps = steps;
        this.age = a - year;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public void setLastname() {
        this.lastname = lastname;
    }

    public void setWeigh() {
        this.weigh = weigh;
    }

    public void setPressure() {
        this.pressure = pressure;
    }

    public void setSteps() {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println(getName() + " " + lastname + " Age:" + getAge() + " (" + getNumber() + "." + getMonth()
                + "." + getYear() + ") email: " + getEmail() + "; " + "phone: " + getPhone() + "; weigh: " + weigh
                + "" + " pressure: " + pressure + "; steps: " + steps);
    }
}
