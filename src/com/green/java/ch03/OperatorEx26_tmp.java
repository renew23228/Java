package com.green.java.ch03; // p114

public class OperatorEx26_tmp {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0); // tree or true - true
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 && ++b != 0); // false and true - false
        System.out.printf("a = %d, b = %d%n", a, b);

    }
}
