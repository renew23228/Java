package com.green.java.ch05;
/*
numArr 배열을 이용하여
copyArr 에 numArr 을 deep copy 해주세요.
copyArr 값을 모두 출력해주세요.

copyArr[0] > 11
copyArr[1] > 14
...
copyArr[5] > 35
 */
public class ArrayQuiz6_deep {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int[] copyArr = new int[numArr.length];

        //deep copy
        for(int i=0; i<numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        //copyArr 의 모든 값을 출력
        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d%n", i, copyArr[i]);
        }

        //*틀린 이유 출력 for 문은 따로
//        System.out.println(numArr[0]);

//        for(i=0;i<copyArr.length;i++) {
//            copyArr[i] = numArr[i];
//            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);

    }
}
