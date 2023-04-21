package com.green.java.ch03;

public class OperatorStudy4 {
    public static void main(String[] args) {
        int num = 5;

        // num = num - 10;
        // num = num * -1;
        num = -num; //num값을 -5로 출력되도록 함

        System.out.println(num);
        System.out.println(-num); // println(-num)만 한다면 -5가 출력되지만 num값이 -5로 바뀐건 아님
    }
}
