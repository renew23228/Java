package com.green.java.ch02;
//p37
public class PrintfEx1 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        char c = 'A';
        boolean bl = true;
        int finger = 10;

        System.out.printf("b=%d\n", b); // \n = %n
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c); //(int)c 문자c의 유니코드값 출력
        System.out.printf("finger=[%5d] \n", finger); //기본적으로 오른쪽 정렬
        System.out.printf("finger=[%-5d] \n", finger); //왼쪽정렬
        System.out.printf("finger=[%05d] \n", finger); //빈 칸은 0으로 채움
    }
}
