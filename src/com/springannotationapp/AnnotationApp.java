package com.springannotationapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");

        Coach coach = context.getBean("tennisCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyTips());

        //Bean scope
        Coach coach1 = context.getBean("tennisCoach",Coach.class);
        System.out.println((coach==coach1));

        context.close();
    }
}
