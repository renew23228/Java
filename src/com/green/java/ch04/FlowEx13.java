package com.green.java.ch04; //p159

public class FlowEx13 {
    public static void main(String[] args) {
//        1~10 사이의 값을 더하기
        int sum = 0;
        for(int i=1; i<11; i++) {
            System.out.printf("sum: %d, i: %d\n", sum, i);
            //sum = sum + i;
            sum += i;
        }
        System.out.println("total - sum : " + sum);
    }
}