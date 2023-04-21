package com.green.java.ch06;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
//        t1.hour = 10; //이 방법은 안됨 private으로 막혀있어서

        //hour 1~23만 저장되게하기
        System.out.println("hour: "+t1.getHour()); // t1.getHour() : 값을 뱉어냄
        t1.setHour(3); //값을 set 하는거0
        t1.setHour(25);
        System.out.println("hour: "+t1.getHour()); // 바뀐걸 확인하기
    }
}
