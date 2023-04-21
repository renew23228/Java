package com.green.java.ch04;

import java.util.Scanner;
/*
합계를 구할 숫자를 입력하세요. (끝내려면 0)
>>100
>>200
>>300
>>0
합계:  600
 */
public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; //while 조건식으로 사용
        Scanner scan = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

        while(flag) {
            System.out.print(">>");

            String input = scan.nextLine();
            num = Integer.parseInt(input);

            if(num!=0) {
                sum = sum + num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계: "+ sum);


    }
}
