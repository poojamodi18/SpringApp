package com.springannotationapp;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private Tips tips;

    @Value("${foo.email}")
    private String mail;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(){}

    public SwimCoach(Tips tips) {
        this.tips = tips;
    }

    @Override
    public String getDailyWorkout() {
        return "10 leaps warm-up";
    }

    @Override
    public String getDailyTips() {
        return tips.getTips();
    }

    public String getMail() {
        return mail;
    }

    public String getTeam() {
        return team;
    }
}
