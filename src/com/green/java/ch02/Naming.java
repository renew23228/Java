package com.green.java.ch02;

public class Naming {

    //p25
    public static void main(String[] args) {
        //단어+단어+단어

        //Hello World Bye
        //기법
        //파스칼 케이스 기법 > 클래스명
        String HelloWorldBye; //무조건 단어의 첫글자는 대문자로

        //카멜 케이스 기법 > 변수명, 메서드명
        String helloWorldBye; //첫 글자는 소문자

        //스네이크 케이스 기법 //DB 컬럼명에서 씀
        String hello_world_bye;

        //케밥 케이스 기법
        //String hello-world-bye; //java에서는 못씀

        //이름에 쓸 수 있는 특수기호 2개 : _ , $
        String _hi, h$i;

        //이름 처음에 숫자 사용X, 처음만 아니면 됨
        //String 1a; //안됨
        String a1;

        //이름에 빈칸 사용할 수 없다
        // String hello World;

        //대소문자 구분
        String aaa;
        String aAa; // aaa, aAa는 서로 다른 것임

        //예약어 사용 금지 (파란색상 단어는 예약어)
        //String public;
        String pUblic; //이건 가능

        final int NUM = 10; // 상수 : 한 번 값이 입력되면 수정될 수 없음. 상수는 전부 대문자. 스네이크 케이스 기법
        //NUM = 20; //not
    }
}
