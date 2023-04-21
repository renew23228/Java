package com.green.java.ch04;

public class WhileStudy1 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println("for");
        }
        System.out.println("--------");

        //아래처럼 while쓸바엔 for문이 나음
        int i=0;
        while(i<5) {
            System.out.println("while");
            i++;
        }
    }
}
