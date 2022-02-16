package com.springapp;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k steps";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void startUp(){
        System.out.println("init start up method");
    }

    public void cleanUp(){
        System.out.println("destroy clean up method");
    }
}
