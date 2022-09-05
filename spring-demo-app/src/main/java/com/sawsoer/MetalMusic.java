package com.sawsoer;

import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music{
    @Override
    public String getSong() {
        return "Clouds over California";
    }
}
