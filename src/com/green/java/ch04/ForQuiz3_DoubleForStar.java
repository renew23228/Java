package com.green.java.ch04;

//중첩 for문을 사용하여 별을 찍어주세요.
//******
//******
//******
//******
//******
//******
public class ForQuiz3_DoubleForStar {
    public static void main(String[] args) {
        int star = 6; // 코드 수정 편의용, 없어도 ok

        for(int i=0; i<star; i++) {

            for(int z=0; z<star; z++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}