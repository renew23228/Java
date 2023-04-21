package com.green.java.ch03; // p105

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1_000) / 1_000f; // int형은 소수점 가질 수 없으니 3141 / 1000f. * 0.001f도 가능. 소수점 아래 592 날리려고
        System.out.println(pi);
        System.out.println(shortPi);
    }
}
