package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[5]; //배열을 방만 만드는 방법

        //숫자형은 기본값 0임
        for(int i=0; i<numArr.length; i++) {
            System.out.println(numArr[i]);
        }

        boolean[] boolArr = new boolean[4]; //배열의 방마다 boolean타입만 들어갈 수 있음. 기본값false임
        for(int i=0; i<boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }

        String[] strArr = new String[3]; //레퍼런스타입의 기본값 null임
        for(int i=0; i<strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
