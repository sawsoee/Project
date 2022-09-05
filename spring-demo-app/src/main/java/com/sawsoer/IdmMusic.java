package com.sawsoer;

import org.springframework.stereotype.Component;

@Component
public class IdmMusic implements Music{
    @Override
    public String getSong() {
        return "Come to Daddy";
    }
}
