package com.green.java.ch05;
/*
번호  국어  영어  수학  총점  평균
=============================
1    100   90   80   270  100.0
2    20    20   20    60  20.0
...
=============================
총점
국어: 190
영어: 180
수학: 170
이렇게 나오도록
 */
public class ArrayEx19_prc2 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        int korsum = 0;
        int engsum = 0;
        int mathsum = 0;

        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        int avg = 0;

        /* score[i][z]
        1행 총점 score[0][z]
        2행 총점 score[1][z]
        3행 총점 score[2][z]
        4행 총점 score[3][z]

        1행 평균 score[0][z] 나누기 score[0].length
        2행 평균 score[1][z] 나누기 score[0].length
        3행 평균 score[2][z] 나누기 score[0].length
        4행 평균 score[3][z] 나누기 score[0].length

        1열 총점(국어총점)
        score[i][0]
        score[i][0]
        score[i][0]
        score[i][0]

        2열 총점(영어총점)
        score[i][1]
        score[i][1]
        score[i][1]
        score[i][1]

        3열 총점(수학총점)
        score[i][2]
        score[i][2]
        score[i][2]
        score[i][2]
         */

        System.out.printf("번호  국어  영어  수학  총점  평균%n=============================%n");
        for(int i=0;i<score.length;i++) {
            for(int z=0;z<score[i].length;z++) {
                }
        }
        System.out.println(sum1);
    }

}
