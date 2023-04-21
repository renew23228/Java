package com.green.java.ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        /*
        객체지향에서는 객체가 몇 개 만들어졌는지 유의. Tv타입의 배열의 각 방에는  Tv객체의 주소값만 들어갈 수 있다.
        */

        for(int i=0;i<tvArr.length;i++) {
            tvArr[i] = new Tv(); // Tv객체가 3개가 만들어짐
            tvArr[i].channel = 10 + i; //tvArr[i]. :객체의주소값.
            /* 위 2줄과 아래 3줄이 같음
            Tv tv = new Tv();
            tvArr[i] = tv;
            tv.channel = 10+i;
             */
        }

        System.out.println(tvArr[2].channel);
    }
}
