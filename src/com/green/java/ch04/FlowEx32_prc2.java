package com.green.java.ch04;

import java.util.Scanner;

/*
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
public class FlowEx32_prc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 달기
        int num; // 입력 받은 값을 저장할 변수
        System.out.println("1. 스퀘어\n2 스퀘어 루트\n3. 로그\n원하는 메뉴(1~3)을 선택하세요. (종료:0) > ");
        //화면에 메뉴판 출력

        while(true) { //무한반복시킬것. 입력 받은 값을 int로 변환해 num에 저장
            String input = scan.nextLine();
            num = Integer.parseInt(input);

            System.out.println("\n1. 스퀘어\n2 스퀘어 루트\n3. 로그\n원하는 메뉴(1~3)을 선택하세요. (종료:0) > ");

            if(num<4 && num>0) {
                System.out.printf("선택하신 메뉴는 %d번입니다.%n%n", num);
            } else if(num==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
        }

    }
}