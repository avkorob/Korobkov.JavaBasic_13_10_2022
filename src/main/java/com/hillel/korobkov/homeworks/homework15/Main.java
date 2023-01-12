package com.hillel.korobkov.homeworks.homework15;

//        Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//        Зробіть класи, які його імплементують: Androids, iPhones.
//        Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//        Створіть екземпляри кожного виду у мейн-класі

public class Main {

    public static void main(String[] args) {

        Androids androids = new Androids("Androids");
        Iphone iphone = new Iphone("iPhone");

        androids.printInfo();
        androids.internet();
        androids.call();
        androids.sms();
        androids.LinuxOS();
        System.out.println();
        iphone.printInfo2();
        iphone.internet();
        iphone.call();
        iphone.sms();
        iphone.iOS();


    }
}
