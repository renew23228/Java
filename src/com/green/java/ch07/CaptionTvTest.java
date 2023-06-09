package com.green.java.ch07;


class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String txt) {
        if(caption) {
            System.out.println(txt);
        }
    }
}

public class CaptionTvTest {

    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("자막 나오니?"); //boolean타입의 디폴트값이 false라서
        ctv.caption = true;
        ctv.displayCaption("!! 자막 나오니?"); //boolean타입의 값을 true 변경해서 이제 출력됨
    }
}
