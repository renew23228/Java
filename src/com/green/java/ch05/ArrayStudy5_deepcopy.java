package com.green.java.ch05;

public class ArrayStudy5_deepcopy {
    public static void main(String[] args) {

        int[] numArr = new int[] { 10, 20, 30, 40, 50};
        int[] copyArr = new int[numArr.length];

        for(int i=0;i<copyArr.length;i++) {
            copyArr[i] = numArr[i];
        }
        //deep copy하려면 배열의 길이가 똑같아야함. copyArr의 각방엔 0이 들어가 있음
        //deep copy 확인법
        //deep copy하고 복사해서 numArr[0] 값 확인
    }
}
