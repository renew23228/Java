package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8바이트), float(4바이트) 정확도는double,
        float f1 = 10; // float f1 = (float)10; , float f1 = 10f; 와 같음. 대문자F 적어도됨
        // float f1 = 10.0; // 10.0에 컴파일 에러 뜨는 이유는 실수형은 기본적으로 double타입임. 뒤에 d(D)가 생략된거
        System.out.println(f1);

        f1 = 9.77f; // f1 = 9.77F; 도 가능, f1 = (float)9.77;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1;
        System.out.println(f2);

        double d1 = 9.77d; // 뒤에 d 안적어도 ok
    }
}
