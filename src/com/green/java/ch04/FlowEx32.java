package com.green.java.ch04; //p177

import java.util.Scanner;

/* while or switch
 (1) square
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요. (종료: 0) > 4
 메뉴를 잘못 선택하셨습니다. (종료: 0)

 (1) square
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요. (종료: 0) > 1
 선택하신 메뉴는 1번입니다.

 (1) square
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요. (종료: 0) >0
 프로그램을 종료합니다.
 */
public class FlowEx32 {
    public static void main(String[] args) {

        System.out.println("(1) square\n(2) square root\n(3) log\n원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");
        int num;

        Scanner scan = new Scanner(System.in);

        while(true) {
            String input = scan.nextLine();
            num = Integer.parseInt(input);

            System.out.println("(1) square\n(2) square root\n(3) log\n원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");

            if(num <4 && num >0) {
                System.out.printf("선택하신 메뉴는 %d번입니다.\n", num);
            } else if(num == 0) {
                System.out.println("프로그램을 종료합니다."); //while문 밖에 적어도됨
                break;
            } else {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
        }
//        System.out.println("프로그램을 종료합니다."); //break위 말고 여기도 ok
    }
}
