package com.sawsoer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private MusicPlayer musicPlayer;
    private String model;

    @Autowired
    public Car(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.model = "Audi";
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){
        return getModel() + musicPlayer.getMusic();
    }
}
