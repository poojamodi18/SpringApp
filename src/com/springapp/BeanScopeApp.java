package com.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-SpringConfig.xml");

        Coach coach = context.getBean("myCoach",Coach.class);

        Coach secondCoach = context.getBean("myCoach",Coach.class);

        //true for singleton and false for prototype
        System.out.println((coach==secondCoach));

        context.close();
    }
}
