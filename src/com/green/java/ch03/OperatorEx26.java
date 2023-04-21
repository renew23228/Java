package com.green.java.ch03; // p114

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println(++b != 0);
        System.out.println(a != 0 || ++b != 0); // true or tree - true .//true 뜨면 뒤에껀 실행안함
        System.out.println(a == 0 && ++b != 0); // false and tree - false
        System.out.println(a == 5 && ++b != 0); // true and true - true
        System.out.println(a == 5 && b++ != 0); // true and false - false //++이 뒤에 있으니 읽기 먼저하니 0 != 0 - false

    }
}
