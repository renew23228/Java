package com.green.java.ch04;

import java.util.Scanner;

/*
    문자열 자르기가 편하다.
    1자리 숫자 구하는게 더 편하다.
    예)12345

    1+2+3+4+5 > 각 자리 값의 합 출력
 */
public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예:12345) > ");
        String temp = scan.nextLine();
        int val = Integer.parseInt(temp);

        while(val>0) {
            int oneVal = val%10;
            sum += oneVal;
            val = val/10;
        }
        System.out.println("각 자리수의 합 : "+sum);

    }
}
