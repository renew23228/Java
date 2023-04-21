package com.green.java.ch03; // p130 3항식

public class OperatorEx32 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ; // abs(절대값의 줄임말)

        absX = x >= 0 ? x : -x; // 1항이 true면 2항 값이 대입되고, false면 3항 값이 대입. 2항 3항에도 연산이 들어갈 수 있음

        System.out.println(absX);

        absY = y >= 0 ? y : -y;
        System.out.println(absY);
    }
}
