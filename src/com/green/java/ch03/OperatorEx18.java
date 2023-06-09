package com.green.java.ch03; // p107

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; //1000이라면 정수/정수라서 소수점 이하 날아가니 1000.0
        System.out.println(shortPi);
        // Math.round() 반올림
        System.out.println(Math.round(315.4)); //반올림
        System.out.println(Math.round(315.5));
        System.out.println(Math.ceil(315.1)); //올림
        System.out.println(Math.floor(315.9)); //내림
    }
}

//게시판
/*
페이징처리
게시판 페이지가 많을 때 Math.ceil 이용

1페이지당 50개 글이 보일 때
490개 글
490/50
 */
