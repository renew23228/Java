package com.green.java.ch04;

//중첩 for문을 이용하여 2~9단 구구단을 출력
//단수가 바뀌면 빈칸 한 줄 추가
public class FlowEx18_re {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for(int z=1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, (i * z));
            }
            System.out.println();
        }
    }
}