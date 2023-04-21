package com.green.java.ch04;

import java.util.Scanner;

/* while 문으로 해결
1~100사이의 랜덤값
1~100 사이의 정수를 입력 : 50
down
1~100사이의 정수를 입력 : 25
up
1~100사이의 정수를 입력 : 30
good

내가 입력한 값과 랜덤값이 다르다면 계속 입력되도록
*/
public class FlowEx28_DoWhile {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1; //1~100
        System.out.println(answer);

        do {
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

            if(input > answer) {
                System.out.println("down");
            } else if(input < answer) {
                System.out.println("up");
            }

        } while(input != answer);
        System.out.println("good!");
    }
}
