package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        // 리터럴 : 값, 그 자체
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 128;
        int i2 = (int)b1; // 자동 형변환. byte타입을 int타입에 넣을 수 없지만 문제될 가능성 없으면 (담을 수 있는 범위면) 자동형변환 해줌
        b1 = (byte)i1; //형변환
        System.out.println(b1); // 오버플로우 현상 일어남

        b1 = (byte)-129;
        System.out.println(b1); //언더플로우
    }
}
