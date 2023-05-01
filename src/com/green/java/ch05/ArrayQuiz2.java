package com.green.java.ch05;
/*
rNumArr은 6칸을 가지고 있는 정수형 배열입니다.
각 칸에 랜덤한 숫자 1~45사이의 값을 모든 칸에 넣어주세요.(중복있음)
 */
public class ArrayQuiz2 {
    public static void main(String[] args) {
        int[] rNumArr = new int[6];
        int i=0;

//        System.out.println((int)(Math.random()*100*0.45));
        for(i=0;i<rNumArr.length;i++) {
            rNumArr[i] = (int)(Math.random()*45)+1; //+1하는 이유 안하면 0~44사이의 값이 나옴
        }

        for(i=0;i<rNumArr.length;i++) {
//            System.out.println(rNumArr[i]);
            System.out.printf("rNumArr[%d] = %d%n", i, rNumArr[i]);
        }
    }
}
