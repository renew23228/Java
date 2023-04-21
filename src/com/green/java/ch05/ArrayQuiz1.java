package com.green.java.ch05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int[] numArr = { 0, 0, 0 };
        //관리.재활용성 높이기 위해 for 문 입력과 출력 각각 1개 사용함
        //첫번째 for (값 입력, 1, 2, 3)

        int i;
        //for(int i=0; i<numArr.length; i++)
        for(i=0;i<3;i++) {
            numArr[i] = (i+1);
        }

        //3대신 numArr.length
        for(i=0;i<3;i++) {
            System.out.printf("numArr[%d] > %d\n", i, numArr[i]);
        }

        //두번째 for (값 출력, 각 방에 있는 값을 출력)
        //0번 인덱스는 1
        //1번 인덱스는 2
        //2번 인덱스는 3
    }
}
