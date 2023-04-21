package com.green.java.ch05;
/*
score[0][0] = 100
score[0][1] = 100
score[0][2] = 100
score[1][0] = 20
...
score[3][2] = 40
sum=570

이렇게 나오도록
 */
public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;
        //for 출력 입력 분리해보기
        for(int i=0;i<score.length;i++) {
            for(int z=0;z<score[i].length;z++) { //z<score[i].length score 1번방이 20,20,20이 아니라 20,20,20,20일 수 있으니
                sum = sum + score[i][z];
                System.out.printf("score[%d][%d] = %d%n", i, z, score[i][z]);
            }
        }
        System.out.printf("sum=%d",sum);
    }
}
