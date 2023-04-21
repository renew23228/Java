package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv(); //타입이 Tv가 의미하는 것 : Tv객체의 주소값만 담을 수 있는 래퍼런스 변수(참조변수).
        System.out.printf("power : %b%n", tv.power); //tv객체에 접근할 수 있기 위해서 tv. : 읽기
        System.out.printf("channel : %d%n", tv.channel);

        tv.power = true; //tv power값 true로 변경 : 쓰기
        System.out.printf("power : %b%n", tv.power); //윗줄로 power 값이 true로 변경되었으니 아랫줄tv.power();에서는 false됨
        tv.power(); //tv메서드에 있는 power를 호출
        System.out.printf("power : %b%n", tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d%n", tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d%n", tv.channel);



    }
}
