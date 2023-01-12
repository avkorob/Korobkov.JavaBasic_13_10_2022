package com.hillel.korobkov.homeworks.homework16.MusicStyles;

public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playMusic(MusicStyles musicStyles);

}