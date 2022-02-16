package com.springapp;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Training";
    }

    @Override
    public String getDailyFortune() {
        return "Coach: "+fortuneService.getFortune();
    }

}
