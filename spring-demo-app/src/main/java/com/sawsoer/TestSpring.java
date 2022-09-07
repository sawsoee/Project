package com.sawsoer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car1 = context.getBean("car",Car.class);
        IdmMusic idmMusic = context.getBean("idmMusic",IdmMusic.class);

        idmMusic.setIdmEnum(IdmMusicEnum.XTAL);
        car1.setModel("Dodge");

        System.out.println(car1);


        context.close();
    }
}
