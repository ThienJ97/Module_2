package com.practice;

import java.util.Date;
import java.util.Random;

public class StopWatch {
    private Date starTime;
    private Date endTime;
    public Date getStarTime(){
        return this.starTime;
    }
    public Date getEndTime(){
        return this.endTime;
    }
    public Date StopWatch(){
        this.starTime = new Date(System.currentTimeMillis());
        return starTime;
    }
    public Date Star(){
        this.starTime = new Date(System.currentTimeMillis());
        return starTime;
    }
    public Date Stop(){
        this.endTime = new Date(System.currentTimeMillis());
        return endTime;
    }
    public long getElapsedTime(){
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[] myArr = random.doubles(100000).toArray();
    }
}
