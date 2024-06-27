package com.practice.springdemo;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "spend 30 min for running";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
