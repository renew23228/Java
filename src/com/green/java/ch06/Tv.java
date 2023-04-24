package com.green.java.ch06;

public class Tv {
    //인스턴스 멤버필드
    String color; //래퍼런스타입은 디폴트값 : null
    boolean power;
    int channel;

    //클래스 멤버필드
    static String brand;

    void power() { power = !power; } //플래그. !power : 만약 파워가 true면 왼쪽 power에 false가 대입됨
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

    static String getBrand() {
        return brand;
    }

}
