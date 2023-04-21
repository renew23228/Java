package com.green.java.ch04;

public class FlowEx18_gugudan2 {
    public static void main(String[] args) {
        int gugudan = 2;

        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", gugudan, i, (gugudan*i));
        }

        //내가 틀린거
        System.out.println("____________");
        for(int i=1; i<10; i++) {
            System.out.printf("%d x i = \n", gugudan, i);
        }
    }
}