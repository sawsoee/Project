package com.sawsoer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;


    @Autowired
    public MusicPlayer(@Qualifier("idmMusic") Music music1, @Qualifier("metalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String getMusic(){
        return "Now playing : " + music1.getSong()+ " " + music2.getSong();
    }


}
