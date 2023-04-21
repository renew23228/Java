package com.green.java.ch05;
/*
numArr 배열을 이용하여
copyArr에 numArr을 deep copy 해주세요.
copyArr 값을 모두 출력해주세요.

copyArr[0] > 11
copyArr[1] > 14
...
copyArr[5] > 35
 */
public class ArrayQuiz6_prc {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int[] copyArr = new int[numArr.length];
//        int[] copyArr = { 11, 14, 2, 7, 36, 35};
        int i = 0;

        for(i=0;i<numArr.length;i++) {
            copyArr[i] = numArr[i]; //deep copy한 copyArr에 numArr의 인덱스값을 넣은것
        }
        System.out.println(copyArr[0]);
        System.out.printf("copyArr[%d] >\n", i);
//        System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);

    }
}
