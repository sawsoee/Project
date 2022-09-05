package com.sawsoer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car1 = context.getBean("car",Car.class);

        System.out.println(car1);


        context.close();
    }
}
