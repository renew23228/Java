package com.green.java.ch06;
import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {

    static int getRandomNumber2(int min, int max) {

        return (int)(Math.random() * (max - min + 1)) + min;
    }

    static int[] getRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];
        int selectedIdx = 0;
        Loop:
        while(selectedIdx < arr.length) { //while: 방에 숫자 넣는 기능
            int rVal = getRandomNumber2(1, 9);

            for(int i=0; i<selectedIdx; i++) { //for: 중복된 값 검사하는 기능
                if(arr[i] == rVal) {
                    continue Loop; //continue실행시 24줄 실행하지 않고 16줄 while로
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }
    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);
        //System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println(" [Game Start] ");

        int[] myArr = new int[NUMBER_COUNT]; //while 안에 있어도됨
        while(true) {
            for(int i=0; i<NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력: ", i + 1);
                myArr[i] = scan.nextInt();
            }

            int s = 0, b = 0, o = 0;
            for(int i=0; i<NUMBER_COUNT; i++) { //사용자 입력 값과 정답지 s b o 비교하는 부분
                for(int z=0; z<NUMBER_COUNT; z++) {
                    if(numArr[i] == myArr[z]) {
                        if(i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, o);

            if(s == NUMBER_COUNT) {
                break;
            }
        }
        System.out.println(" [Game Over] ");






    }
}