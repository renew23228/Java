package com.green.java.ch04;
/*
____*
___**
__***
_****
*****
 */
//for문 2개와 분기문 쓰는 방법
public class ForQuiz4_for2piece {
    public static void main(String[] args) {
        int star = 5; // 코드 수정 편의용

        for(int i=star; i>0; i--) {
            for(int z=1; z<=star; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}