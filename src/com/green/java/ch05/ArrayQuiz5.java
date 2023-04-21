package com.green.java.ch05;
/*
numArr배열을 이용하여
모든 방 값 중에 홀수값만 전부 더해서 출력해주세요.
odd-sum: ??
 */
public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int i = 0;
        int sum = 0;

        for(i=0;i<numArr.length;i++) {
            if(numArr[i]%2 == 1) {
                sum = sum + numArr[i];
            }
        }
        System.out.println("odd-sum: "+sum);
    }
}
