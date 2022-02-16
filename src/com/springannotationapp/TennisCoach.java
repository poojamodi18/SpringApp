package com.springannotationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
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

    @PostConstruct
    public void startUp(){
        System.out.println("init start up method");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("destroy clean up method");
    }

}
