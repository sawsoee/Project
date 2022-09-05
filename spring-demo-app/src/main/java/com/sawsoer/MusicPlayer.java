package com.sawsoer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class MusicPlayer {

    private MetalMusic metalMusic;
    private RapMusic rapMusic;
    private Music music;
    private String playerName;
    private String country;
    private int volume;

    @Autowired
    public MusicPlayer(MetalMusic metalMusic, RapMusic rapMusic) {
        this.metalMusic = metalMusic;
        this.rapMusic = rapMusic;
    }

    public String getMusic(){
        return "Now playing : " + metalMusic.getSong()+ " " + rapMusic.getSong();
    }


}
