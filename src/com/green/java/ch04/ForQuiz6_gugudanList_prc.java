package com.green.java.ch04;
/*
 2 x 1 = 2 중간에 탭넣기 3 x 1 = 3 4 x 1 = 4 ... 9 x 1 = 9
 2 x 2 = 4 3 x 2 = 6 ...
 ...
 2 x 9 = 18 3 x 9 = 27 ...
 */
public class ForQuiz6_gugudanList_prc {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for(int z=2; z<10; z++) {
                System.out.printf("%d x %d = %d\t", z, i, z*i);
            }
            System.out.println();
        }
    }
}
