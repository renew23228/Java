package com.green.java.ch03; // p110

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", 10 == 10.0f); //%b : boolean타입
        System.out.printf("'0' == 0 \t %b\n", '0' == 0); //문자 0은 정수로 바뀌어서 정수 0과 비교됨
        System.out.printf("'a' == 65 \t %b\n", 'A' == 65);

        System.out.printf("'A' + 1 == 'B' \t %b\n", 'A' + 1 == 'B'); // == : 왼쪽 오른쪽이 같냐?
        System.out.printf("'A' + 1 != 'B' \t %b\n", 'A' + 1 != 'C'); // != : 왼쪽 오른쪽이 같지 않니?. !(not,반대)

    }
}
