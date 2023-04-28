package com.green.java.ch02;
//문자열 자르기
public class StringStudy1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmn"; //문자 배열이라서 0번부터 시작

        String r1 = str.substring(0,4); //abcd 출력. 새로운 문자열을 만들어서 return.
        System.out.println(str);
        System.out.println(r1);

        String r2 = str.substring(3,6);
        System.out.println(r2);

        String r3 = str.substring(5); //1개의 인덱스값이면  5번 포함해서 이후 문자열 출력
        System.out.println(r3);

        int idx = str.indexOf("g");
        System.out.println("idx : "+idx); //문자열 g는 6번 인덱스값에 있음

        int len = str.length();
        System.out.println("len : "+len);

        char[] charArr = str.toCharArray(); //charArr배열 딥카피 후 주소값을 준거. 그래서 원본은 건드릴 수 없음
        System.out.println(charArr[0]);
        System.out.println(charArr[1]);
    }
}

/*

 */
