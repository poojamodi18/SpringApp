package com.springannotationapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyTips());
        System.out.println("Email "+coach.getMail());
        System.out.println("Team "+coach.getTeam());

        context.close();
    }
}
