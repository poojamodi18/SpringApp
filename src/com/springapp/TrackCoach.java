package com.springapp;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 5k steps";
    }
}
