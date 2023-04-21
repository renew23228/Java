package com.green.java.ch05; //p197 예제5-6
/*
numArr 배열을 이용하여
배열에서 가장 작은 숫자를 찾아내어 출력해주세요.

min: 2
 */
public class ArrayQuiz10_min {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int min = numArr[0];

        for(int i=0; i<numArr.length;i++) {
            if(numArr[i] < min) {
                min = numArr[i];
            }
        }
        System.out.printf("min: %d%n", min);
    }
}
