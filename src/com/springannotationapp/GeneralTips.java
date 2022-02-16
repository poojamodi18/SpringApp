package com.springannotationapp;

import org.springframework.stereotype.Component;

@Component
public class GeneralTips implements Tips{

    @Override
    public String getTips() {
        return "Focus on breathing pattern";
    }
}
