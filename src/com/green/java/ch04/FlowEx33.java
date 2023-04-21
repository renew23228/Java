package com.green.java.ch04; //p178

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1: //이름규칙없음
        for(int i=2; i<=9; i++) {
            for(int z=1; z<=9; z++) {
                if(z == 5) {
                    break Loop1; //제일 가까운 반복문만 빠져나옴. Loop1 적으면 바깥 반복문을 빠져나옴. continue도됨
                }
                System.out.printf("%d, %d\n", i, z);
            }
        }
    }
}
