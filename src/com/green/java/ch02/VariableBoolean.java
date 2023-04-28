package com.green.java.ch02;

public class VariableBoolean {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        b2 = 10 > 2; // b2= false(boolean타입의 기본값)가 b2=true(10>2)로 변함
        System.out.println(b2);

        boolean c1 = false, c2 = true;
        System.out.println(c1);

        c1 = 1900 > 35; // 비교연산자의 결과는 boolean타입이라는거 기억하기
        System.out.println(c1);

        c1 = 35 > 1900;
        System.out.println(c1);
    }
}
