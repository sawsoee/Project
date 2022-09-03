package com.sawsoer;

import java.util.Scanner;

public class MusicPlayer {
    private Music music;
    private String playerName;
    private String country;
    private int volume;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){};

    public void getMusic(){
        System.out.println("Now playing : " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
