package com.green.java.ch02;

public class VariableChar {
    public static void main(String[] args) {
        //변수 선언과 초기화 동시 가능
        char c1 = 'A'; //문자 A, ' ' 씀

        //변수 선언과 초기화 각각 하는 것
        char c2; // 변수 선언
        c2 = 'B'; // 변수 초기화

        System.out.println(c2);
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);

        c1 = 'C';
        System.out.printf("%c : %d \n", c1, (int)c1);  //c는 캐릭터타입, d는 데시멀(정수형 타입)
        System.out.printf("%c : %d \n", c1, (int)c1);
    }
}
