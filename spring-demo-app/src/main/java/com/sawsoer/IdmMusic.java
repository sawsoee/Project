package com.sawsoer;

import org.springframework.stereotype.Component;

@Component
public class IdmMusic implements Music{
    private IdmMusicEnum idmEnum;

    public void setIdmEnum(IdmMusicEnum idmEnum) {
        this.idmEnum = idmEnum;
    }

    @Override
    public String getSong() {
        return String.valueOf(idmEnum);
    }
}
