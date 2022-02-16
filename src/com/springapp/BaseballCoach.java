package com.springapp;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball training";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
