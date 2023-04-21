package com.green.java.ch05;

import java.util.Arrays;

/*
인덱스 0~5 사이의 값이 나오도록
for 문이 돌 때 ex) i=0일때 3이 나왔다면 0번자리 값을 3번 인데스 값인 7로 바꾸기
 */
public class ArrayQuiz12_swap_prc2 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int i=0;
//        int z;
//        int tmp;

        for(i=0;i<numArr.length;i++) {
            int z=(int)(Math.random()*numArr.length); //Math.random()*numArr.length에 () 씌우기

            int tmp = numArr[i];
            numArr[i] = numArr[z];
            numArr[z] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
