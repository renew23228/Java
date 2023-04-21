package com.green.java.ch04;

import java.util.Scanner;

/*
while문에 true 넣고하는 방법
합계를 구할 숫자를 입력하세요. (끝내려면 0)
>>100
>>200
>>300
>>0
합계:  600
 */
public class FlowEx27_true {
    public static void main(String[] args) {
        int num;
        int sum = 0;
//        boolean flag = true; //while 조건식으로 사용
        Scanner scan = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

        while(true) {
            System.out.print(">>");

            String input = scan.nextLine();
            num = Integer.parseInt(input);

            if(num==0) {break;}
                sum = sum + num;
        }
        System.out.println("합계: "+ sum);


    }
}

/*
if(input == 0) { break; }

            if(input > answer) {
                System.out.println("down");
            } else if(input < answer) {
                System.out.println("up");
            }
 */