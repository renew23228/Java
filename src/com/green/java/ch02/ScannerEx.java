package com.green.java.ch02;

import java.util.Scanner; //String은 자동 임포트

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 저기서 scan(변수명)만 바꿀 수 있고 나머지는 그대로 입력

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input); //입력 받은 문자열을 숫자로 변환

        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d\n", num);
    }
}
