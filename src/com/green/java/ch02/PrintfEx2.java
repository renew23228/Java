package com.green.java.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        //f2 f3 지수표현 안함
        double d = 1.2345678;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //실수는 %f임 float이든 double이든
        System.out.printf("d=%f\n", d); //%f는 소수점 6자리까지만
        System.out.printf("d=%14.10f\n", d); //%전체자리.소수점아래자리f
        System.out.printf("d=%.3f\n", d); // 소수점3자리만

        System.out.println("[12345678901234567890]");
        System.out.printf("[%s]\n", url); //%s는 boolean등 모든 타입 불러올 수 있음
        System.out.printf("[%30s]\n", url);
        System.out.printf("[%-30s]\n", url);
        System.out.printf("[%.8s]\n", url);



    }
}
