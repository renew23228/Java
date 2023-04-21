package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러 값을 저장하기 위한 공간. 배열의 친구는 for문
        int n1=1, n2=2, n3=3;
        n1 = 2; //변수의 값 변경

        int[] numArr = {10, 20, 30, 40}; // int[] : int형 배열이라는 의미. int형 방이 여러개
        int numArr2[] = {10, 20}; // c언어방식. 이렇게해도 되지만 항상 윗줄처럼 쓰기

        numArr[0] = 11; // 0번방에 11 값을 저장
        int num = numArr[0];
        System.out.println("num : "+num);
    }
}
