package com.green.java.ch07;

public class MyTv extends Speaker {
    int channel;

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

}
class MyTv2 {
    int channel;
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
    Speaker speaker; //tv는 스피커를 가졌다. 포함관계

    MyTv2() {
        speaker = new Speaker();
    }

    void volumnUp() {
        speaker.volumnUp();
    }
    void volumnDown() {
        speaker.volumnDown();
    }
    int getVolumn() {
        return speaker.volumn;
    }
}

class Speaker {
    int volumn;

    void volumnUp() {
        volumn++;
    }

    void volumnDown() {
        volumn--;
    }
}