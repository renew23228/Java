package com.green.java.ch04;

import java.util.Scanner;

/* while문으로 해결
1~100사이의 랜덤값
1~100 사이의 정수를 입력 : 50
down
1~100사이의 정수를 입력 : 25
up
1~100사이의 정수를 입력 : 30
good

내가 입력한 값과 랜덤값이 다르다면 계속 입력되도록
*/
public class FlowEx28_xx {
    public static void main(String[] args) {
        int num, answer;


        answer = (int)(Math.random()*100)+1;
        Scanner scan = new Scanner(System.in);

        System.out.println(answer); //정답


        do {
            num = scan.nextInt();
            if(num > answer) {
                System.out.println("down");
            } else if(num < answer) {
                System.out.println("up");
            }
            System.out.println("1~100 사이의 정수를 입력: ");
        } while(num != answer);

        System.out.println("정답");
    }
}
