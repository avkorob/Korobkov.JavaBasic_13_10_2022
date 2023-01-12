package com.hillel.korobkov.homeworks.homework16;

import com.hillel.korobkov.homeworks.homework16.MusicStyles.ClassicMusic;
import com.hillel.korobkov.homeworks.homework16.MusicStyles.MusicStyles;
import com.hillel.korobkov.homeworks.homework16.MusicStyles.PopMusic;
import com.hillel.korobkov.homeworks.homework16.MusicStyles.RockMusic;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] groups = {
                new RockMusic("Pink Floyd"),
                new RockMusic("Led Zeppelin"),
                new RockMusic("AC/DC"),
                new PopMusic("Dua Lipa"),
                new PopMusic("Madonna"),
                new PopMusic("ABBA"),
                new PopMusic("Miley Cyrus"),
                new ClassicMusic("Ludwig van Beethoven"),
                new ClassicMusic("Johann Sebastian Bach"),
                new ClassicMusic("Wolfgang Amadeus Mozart")
        };

        for (MusicStyles musicStyles : groups) {
            musicStyles.playMusic(musicStyles);
        }
    }

}