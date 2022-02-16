package com.springannotationapp;

import org.springframework.stereotype.Component;

@Component
public class GreatTips implements Tips{

    @Override
    public String getTips() {
        return "Focus on ball speed";
    }
}
