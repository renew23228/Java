package com.green.java.ch04;

import java.util.Scanner;

/*
    문자열 자르기가 편하다.
    1자리 숫자 구하는게 더 편하다.
    예)12345

    1+2+3+4+5 > 각 자리 값의 합 출력
 */
public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예:12345) > ");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp); // = 이 있으니 void메서드가 아님

        System.out.printf("각 자리수의 합 : %d%n", sum);

    }

    public static int sumStringNumber(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;

        while(val>0) {
            sum += val % 10;
//            sum = sum + (val%10);
            val = val/10;
        }
        return sum;

    }

}
