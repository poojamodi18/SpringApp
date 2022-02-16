package com.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloStringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        Coach coach = context.getBean("TrackCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
