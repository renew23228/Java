package com.green.java.ch04;
/*
    [1, 1] [1. 2] [1, 3]
    [2, 1] [2, 2] [2, 3]
    [3, 1] [3, 2] [3, 3]
 */
public class FlowEx20 {
    public static void main(String[] args) {
        int num = 4; // 리터럴 값 4가 두 번 쓰였으니 int num 쓰는게 좋음
        for(int i=1; i<num; i++) {
            for(int z=1; z<num; z++) {
                System.out.printf("[%d, %d]\t", i, z);
            }
            System.out.println();
        }
    }
}
