package com.green.java.ch05; //p214

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] temp = { //temp는 주소값을 4개 가지고 있음
                {0, 0, 0}, //temp[0]
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };
        System.out.printf("temp.length: %d%n", temp.length);
        System.out.printf("temp[0].length: %d%n", temp[0].length);
        System.out.printf("temp[1].length: %d%n", temp[1].length);
        System.out.printf("temp[2].length: %d%n", temp[2].length);


        System.out.printf("temp[0][0] > %d%n", temp[0][0]); //temp[0][0] :0번 칸의 0번 인덱스
        int[] arr0 = temp[0];
        arr0[0] = 30;
        System.out.printf("temp[0][0] > %d%n", temp[0][0]); //temp[0][0] :0번 칸의 0번 인덱스



        int[][] score = new int[4][3];

        System.out.println(score[0][0]);
        score[2][1] = 10;

        System.out.println(score.length); // 행 값 4
        System.out.println(score[0].length); //
    }
}
