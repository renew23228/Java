package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28_DoWhileMethod {

    public static int getRandomNumber(int min, int max) {

        return (int)(Math.random() * (max - min + 1)) + min; //0이 나왔을때 최소값은 무조건 나와야하니 +min은 해야함
    }

    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1, 100);
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