package com.green.java.ch04;

public class FlowEx14 {
    public static void main(String[] args) {
        //조건식항엔 하나의 조건식만. || && 쓰면 가능
        for(int i=1, j=10; i<=10; i++, j--) {
            System.out.printf("%d \t %d\n", i, j);
        }
    }
}