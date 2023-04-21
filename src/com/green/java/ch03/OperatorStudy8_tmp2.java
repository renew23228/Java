package com.green.java.ch03; //

import java.util.Scanner;

public class OperatorStudy8_tmp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자입력 : "); // 뒷줄에 적으면 안됨
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        String x = "짝수", y = "홀수"; // 문자열 변수 x, y 선언과 초기화

        String result = (num % 2) == 0 ? x : y; // String result 변수 선언 및 초기화

        System.out.println(result);
        System.out.printf("숫자 %d는 %s이다.", num, result);









        //num값이 홀수면 "홀수" 출력.
        //num값이 짝수면 "짝수" 출력.
    }
}
