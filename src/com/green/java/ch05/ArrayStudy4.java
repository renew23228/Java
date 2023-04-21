package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {

        int[] numArr = new int[] { 10, 20, 30, 40, 50}; // new int[] 생략가능
        int[] copyArr = numArr; // 실체는 하나지만 접근하는게 copyArr, numArr 두개임

        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d%n", i, copyArr[i]);
        }
    }
}
