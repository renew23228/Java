package com.green.java.ch05; //p196
/*
numArr 배열을 이용하여
배열에 들어있는 값 평균값 구해주세요.

avg: ??
 */
public class ArrayQuiz11_avg {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int i=0;
        int sum=0;

        for(i=0;i<numArr.length;i++) {
            sum = sum + numArr[i];
        }

        double avg = (double)sum / numArr.length;
        System.out.printf("sum: %d, avg: %f%n", sum, avg);

        System.out.printf("avg: %.2f", (float)sum/numArr.length); //My
    }
}
