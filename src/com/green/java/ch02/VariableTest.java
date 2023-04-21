package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args){
        String r1 = "안녕" + 1 + 1; // 안녕 : 스트링타입, 1 : 정수타입
        System.out.println(r1);

        String r2 = "안녕" + (1 + 1);
        System.out.println(r2);

        String r3 = 1 + 1 + "안녕"; //연산의 순서가 다르면 값이 다름
        System.out.println(r3);

        String r4 =  "하이" + 2 + 9;
    }
}
