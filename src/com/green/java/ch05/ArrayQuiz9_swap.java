package com.green.java.ch05;

import java.util.Arrays;

/*
numArr 배열을 이용하여
값 리터럴 적지 않는다.

0번, 1번방 값 스와이핑
 */
public class ArrayQuiz9_swap {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
//        int tmp=0;
//        tmp = numArr[0];
        int tmp = numArr[0];
        numArr[0] = numArr[1];
        numArr[1] = tmp;

        System.out.println(Arrays.toString(numArr));

    }
}
