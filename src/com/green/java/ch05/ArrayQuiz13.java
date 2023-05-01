package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr1(lottoArr);
        //1.중복되지 않는 1~45의 값을 배열에 채운다
        //2.중복 허용
        System.out.println(Arrays.toString(lottoArr)); //sort하기 전

        //오름차순 정렬(버블정렬) //앞쪽에 큰 값이 몰려있으면 느림
        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    public static void sortArr(int[] lottoArr) {
        for(int i = lottoArr.length-1;i>0;i--) {
            for(int z=0;z<i;z++) {
                int sideIdx = z+1;
                if(lottoArr[z]>lottoArr[sideIdx]) {
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[sideIdx];
                    lottoArr[sideIdx] = temp;
                }
            }
        }
    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int)(Math.random()*(eVal-sVal+1))+sVal;
    }

    public static void setRandomValuArr2(int[] lottoArr) {
        Loop:
        for(int i=0; i<lottoArr.length; ) {
            int rVal = getRandomValueFromTo(1,45);
            for(int z=0;z<i;z++) {
                if(lottoArr[z]==rVal) { continue  Loop; }
            }
            lottoArr[i++] = rVal;
        }
    }
    public static void setRandomValuArr1(int[] lottoArr) {
        for(int i=0; i<lottoArr.length;i++) {
            int rVal = getRandomValueFromTo(1,45);
            for(int z=0;z<lottoArr.length;z++) {
                if(lottoArr[z] == 0) {
                    lottoArr[z] = rVal;
                    break;
                } else if(lottoArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
}
