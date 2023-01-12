package com.hillel.korobkov.homeworks.homework16.MusicStyles;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println("Pop Music group: " + getName());
    }

}