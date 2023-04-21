package com.green.java.ch04;

public class ForStudy1_ForBasic {
    public static void main(String[] args) {
        /*
        for( 1항 ; 2항 ; 3항 ) /2항 사용 안하면 무한루프
        1항 초기화칸 ; 2항 조건식 ; 3항 증감식
        실행순서 : 1 -> 2 -> S -> 3 -> 2 -> s -> 3 ~~~ //2항이 true인 동안 계속 2 s 3 실행

        for문은 몇 번 돌아갈지 만들 줄 알아야함
         */
//        for(int i = 21; i>=18; i--) {
//            System.out.println("A"); //s
//        }
        for(int i=5; i<=9; i++) {
            System.out.println(i-4);
        }
//        for(int i=5; i>1; i--) {
//            System.out.println(-4+i);
//        }
    }

}
