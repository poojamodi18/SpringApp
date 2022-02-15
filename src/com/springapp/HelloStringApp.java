package com.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloStringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        Coach baseBallCoach = context.getBean("BaseBall",Coach.class);
        System.out.println(baseBallCoach.getDailyWorkout());

        Coach trackCoach = context.getBean("TrackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkout());

        context.close();
    }
}
