package com.sawsoer;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{

    public void getInitMethod(){
        System.out.println("RapMusic initialization");
    }
    public void getDestroyMethod(){
        System.out.println("RapMusic destroyed");
    }
    @Override
    public String getSong() {
        return "Free Spirit";
    }
}
