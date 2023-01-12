package com.hillel.korobkov.homeworks.homework16.MusicStyles;

public class RockMusic extends MusicStyles{

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println("Rock Music group: " + getName());
    }

}