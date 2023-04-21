package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5_Grade_prc {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = ' ';

        System.out.print("점수 입력하세요. >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();





        // 100점 > A+
        // 90점 보다 크거나 같으면 "%d점의 학점은 A+입니다."
        // 80점 보다 크거나 같으면 "%d점의 학점은 B-입니다."
        // 70점 보다 크거나 같으면 "%d점의 학점은 C0입니다."
        // 70점 미만 opt 없음 무조건 D학점, 나머지 "%d점의 학점은 D입니다."

        //1의 3자리가 8점이상 +, 4미만 -, 나머지 0


    }
}