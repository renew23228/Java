package com.green.java.ch06;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) { //int hour: 파라미터(매개변수). 외부에서 들어오는 값
        if(hour<24&&hour>0) { //0과 24에 상수값을 주고 쓰는게 좋음
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
