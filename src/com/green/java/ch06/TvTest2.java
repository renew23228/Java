package com.green.java.ch06;

/*
channelUp 메서드를 아무리 호출해도
channel값이 5 초과가 되지 않게 작업 MAX값 5
 */
public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();

        for (int i = 0; i < 10; i++) {
            tv.channelUp();
        }
        System.out.printf("channel : %d%n", tv.channel);

        for (int i = 0; i < 10; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d%n", tv.channel);

    }
}

class Tv2 {
    String color;
    boolean power;
    int channel;

    final int MAX_CHANNEL = 5; //스네이크케이스기법. 상수: 한 번 입력되면 변경될 수 없음
    final int MIN_CHANNEL = 1;
    void power() {
        power = !power;
    } //플래그. !power : 만약 파워가 true면 왼쪽 power에 false가 대입됨

    void channelUp() {
        if (channel < MAX_CHANNEL) { //5 대신 상수 MAX_CHANNEL 쓰기
            ++channel;
        }
    }

    void channelDown() {
        if (channel > MIN_CHANNEL) { //1 대신 상수 MIN_CHANNEL 쓰기
            --channel;
        }
    }

}