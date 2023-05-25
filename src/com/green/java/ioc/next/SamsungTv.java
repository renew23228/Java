package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

// implements한 인터페이스를 구현해야함
public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void turnOn() {
        System.out.println("삼성tv 켜기");
        speaker.volumeUp();
    }

    @Override
    public void turnOff() {
        System.out.println("삼성tv 끄기");
        speaker.volumeDown();
    }
}
