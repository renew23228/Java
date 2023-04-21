package com.green.java.ch05;
/*
rNumArr은 6칸을 가지고 있는 정수형 배열입니다.
각 칸에 랜덤한 숫자 1~45사이의 값을 모든 칸에 넣어주세요.
 */
//int[] rNumArr = new int[6]
public class ArrayQuiz2_prc {
    public static void main(String[] args) {
        int[] rNumArr = new int[6];
        int i=0;
        for(i=0;i<rNumArr.length;i++) {
            rNumArr[i] = (int)(Math.random()*100*0.45)+1;
        }
        for(i=0;i<rNumArr.length;i++) {
            System.out.printf("fNumArr[%d] = %d%n", i, (int)(Math.random()*100*0.45)+1);
        }
    }
}
