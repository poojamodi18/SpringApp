package com.springannotationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("greatTips")
    private Tips tips;

    public TennisCoach(){}

    /*@Autowired
    public TennisCoach(@Qualifier("greatTips") Tips tips) {
        this.tips = tips;
    }*/

//    @Autowired
//    public void setTips(Tips tips) {
//        this.tips = tips;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis";
    }

    @Override
    public String getDailyTips() {
        return tips.getTips();
    }

}
