package com.green.java.ch05;

import java.util.Arrays;

/*

 */
public class ArrayQuiz13_My {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        //중복되지 않는 1~45의 값을 배열에 채운다.
        //중복 허용된 1~45의 값을 배열에 채운다.
    }

    static void setRandomValuArr(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            lottoArr[i] = (int) (Math.random() * 45) + 1;
//            ValCheck(lottoArr);
//            for(int z=0;z< lottoArr.length-1;z++) {
//                if(lottoArr[z] == lottoArr[z+1]) {
//                    lottoArr[z+1] = (int)(Math.random()*45)+1;
//                }
//            }
//        }

//        while(true) {}
        }
//01 02 03 04 05/ 12 13 14 15/ 23 24 25/ 34 35/ 45/
//        static void ValCheck ( int[] lottoArr){
//            for (int i = 0; i < lottoArr.length - 1; i++) {
//                for (int z = lottoArr.length - 1; z > 0; z--) {
//                    if (lottoArr[z] == lottoArr[z + 1]) {
//                        lottoArr[z + 1] = (int) (Math.random() * 45) + 1;
//                    }
//                }
//            }
//        }
    }
    }
