package com.green.java.ch03;

public class OperatorStudy6 {
    public static void main(String[] args) {
        int n1, n2, val = 10;

        n1 = n2 = val; // =을 만나서 오른쪽부터 실행. 두번째 = 부터 실행됨. n2 = val 먼저 실행 후-> n1 = n2 실행

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(val);
    }
}
