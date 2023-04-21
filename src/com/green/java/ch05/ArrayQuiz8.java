package com.green.java.ch05;
/*
numArr 배열을 이용하여
Arrays.toString메소드 이용하지 않고
아래처럼 출력되도록 로직으로 해결하세요.
[11, 14, 2, 7, 36, 35]

 */
public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };

        System.out.print("[");
        for(int i = 0;i<numArr.length;i++) {
            if(i !=0) { //i=0이 아닐때는  ,가 찍힌다음 numArr[i] 값이 찍힘
                System.out.print(", ");
            }
            System.out.print(numArr[i]);
        }
        System.out.println("]");

        System.out.println("-----------------------다른방법");

        System.out.printf("[%d", numArr[0]);
        for(int i=1;i<numArr.length;i++) {
            System.out.printf(", %d", numArr[i]);
        }
        System.out.println("]");


        System.out.println("-----------------------다른방법");
        int i = 0;

        for(i=0;i<numArr.length;i++) {
            if(i==numArr.length-1) {
                System.out.print(numArr[i]+"]");
            } else if(i>0 && i<numArr.length-1) {
                System.out.print(numArr[i]+", ");
            } else {
                System.out.print("["+numArr[i]+", ");
            }
        }

    }
}
