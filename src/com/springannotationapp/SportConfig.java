package com.springannotationapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springannotationapp")
@PropertySource("classpath:sports.properties")
public class SportConfig {

    @Bean
    public Tips generalTips(){
        return new GeneralTips();
    }

    @Bean Coach swimCoach(){
        return new SwimCoach(generalTips());
    }
}
