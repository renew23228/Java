package com.green.java.ch04;
/*
____*
___**
__***
_****
*****
 */
//for문 3개 쓰는 방법
public class ForQuiz4_for3piece {
    public static void main(String[] args) {
        int star = 5;

        for(int i=1; i<=star; i++) {
            for(int z=star; i<z; z--) {
                System.out.print("_");
            } for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}