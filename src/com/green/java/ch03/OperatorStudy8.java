package com.green.java.ch03; //

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력: ");

        int num = scan.nextInt();
        String result; // 변수 result가 출력되는게 홀수, 짝수(문자열)이니깐 변수타입 String

        String x = "짝수", y = "홀수";
        result = (num % 2) == 0 ? x : y;

        System.out.println("num : " + num);
        System.out.println(result);

        //num값이 홀수면 "홀수" 출력.
        //num값이 짝수면 "짝수" 출력.
    }
}
