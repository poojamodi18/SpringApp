package com.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        CricketCoach coach = context.getBean("cricketCoach",CricketCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
    }
}
