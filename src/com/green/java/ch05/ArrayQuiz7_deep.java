package com.green.java.ch05;

import java.util.Arrays;

/*
numArr 배열을 이용하여
copyArr 은 numArr 보다 1칸 더 많게 만들어주세요.
마지막 방에는 100을 넣어주세요.

copyArr 에 numArr 을 deep copy 해주세요.
copyArr 값을 모두 출력해주세요.

 */
public class ArrayQuiz7_deep {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int[] copyArr;
        int i = 0;

        copyArr = new int[numArr.length+1]; //배열 생성
        copyArr[numArr.length] = 100; //마지막 방에 100 저장
//        copyArr[copyArr.length-1] = 100; //다른 방법

        for(i=0;i<numArr.length;i++) {
            copyArr[i] = numArr[i];
        }

        String result = Arrays.toString(copyArr);
        System.out.println(result);

        System.out.println("------------------------------------");

        for(i=0;i<copyArr.length;i++) {
            System.out.printf("copyArr[%d] = %d%n", i, copyArr[i]);
        }
    }
}