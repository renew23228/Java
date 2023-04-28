package com.green.java.ch02;

import java.util.Arrays;

public class StringStudy2 {
    public static void main(String[] args) {
        String str = "안녕하세요.**저는 홍길동 입니다.";
        String r1 = str.replace("*","").trim(); //*을 빈문자열로 바꿔줌
        //.trim(); //문자열 앞뒤 공백 제거
        //String r1 = str.replace("*","").trim(); - 체이닝 기법/ 계속 . 붙여서 호출가능
        System.out.println(r1);

        String str2 = "A:B:C:D:E";
        String[] strArr = str2.split(":"); // :을 자르고 A B C D E 로 나누어 배열에 저장
        System.out.println("strArr : "+Arrays.toString(strArr));

        String str3 = "AbDdEfG";
        String r2 = str3.toLowerCase(); //원본은 건들지 않고 소문자로
        System.out.println("r2 : "+r2);
        String r3 = str3.toUpperCase(); // " 대문자로
        System.out.println("r3 : "+r3);

//        String r0 = str.replaceAll("[*]",""); //정규식
    }
}
