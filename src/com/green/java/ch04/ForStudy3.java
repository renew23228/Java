package com.green.java.ch04; //p137
/*
바깥 for문 : 시
안쪽 for문 : 분
안쪽 for문 z값 01234 다 돌고 바깥 for문 i값 돌아갈 차례

안에 for문이 더 많아지면 시 분 초 ~~~~~~~~~~~~~
 */
public class ForStudy3 {
    public static void main(String[] args) {

        for(int i=0; i<3; i++) {

            for(int z=0; z<5; z++) {
                System.out.printf("i: %d, z: %d\n", i, z);
            }

        }
    }
}