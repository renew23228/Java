package com.green.java.ch06;

public class OverloadingTest {
    public static void main(String[] args) {
        sum(1,2,3);

    }

    public static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void sum(int n1, int n2, long n3) { //매개변수의 타입과 개수가 달라야함
        System.out.println(n1+n2+n3);
    }

    public static int sum(int k1, int k2, int k3) {
        return k1+k2+k3;
    }
}
