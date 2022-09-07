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
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "Model :" + getModel()+" " + musicPlayer.getMusic();
    }
}
