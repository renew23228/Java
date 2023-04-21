package com.green.java.ch03; //

import java.util.Scanner;

public class OperatorStudy8_tmp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num =  scan.nextInt();

        System.out.println("num : " + num);

        String x = "짝수", y = "홀수"; // 조건연산자에 쓸 문자열 변수 x, y를 선언과 초기화
        String result; // 변수 result가 출력되는게 홀수, 짝수(문자열)이니깐 변수타입 String
        result = (num % 2) == 0 ? x : y; // 1항이 true면 x 값이 result에 대입. 1항이 false면 y값이 result에 대입

        System.out.println(result); //문자열 변수 result를 출력



        //num값이 홀수면 "홀수" 출력.
        //num값이 짝수면 "짝수" 출력.
    }
}
