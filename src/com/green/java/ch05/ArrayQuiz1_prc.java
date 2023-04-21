package com.green.java.ch05;

public class ArrayQuiz1_prc {
    public static void main(String[] args) {
        int[] numArr = { 0, 0, 0 };
        //관리.재활용성 높이기 위해 for문 입력과 출력 각각 1개 사용함
        //첫번째 for (값 입력, 1, 2, 3)
//        numArr[0] = 1;
//        numArr[1] = 2;
//        numArr[2] = 3;

        int i=0;
        for(i=0;i<numArr.length;i++) {
            numArr[i] = i+1;
        }

        for(i=0;i<numArr.length;i++) {
            System.out.printf("numArr[%d] = %d%n", i, i+1);
        }



        //두번째 for (값 출력, 각 방에 있는 값을 출력)
        //0번 인덱스는 1
        //1번 인덱스는 2
        //2번 인덱스는 3
    }
}
