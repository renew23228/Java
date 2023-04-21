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
public class WhileQuiz1 {
    public static void main(String[] args) {
        int input, answer;
        //0.00000000 ~ 0.99999999 값만 나옴
        answer = (int)(Math.random()*100)+1; //0~4까지만 나옴
        //*10하면 0~9까지만 나옴 10 나오려면 answer = (int)(Math.random()*10)+1;
        Scanner scan = new Scanner(System.in);
        System.out.println(answer);

        System.out.println("1~100 사이의 정수를 입력: ");
        input = scan.nextInt();

        while(input != answer) {
            if(input>answer) {
                System.out.println("down");
            } else if(input<answer) {
                System.out.println("up");
            }
            System.out.println("1~100사이의 정수를 입력");
            input = scan.nextInt();
        }
        System.out.println("good!");

    }
}
