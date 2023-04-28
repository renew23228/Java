package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
//        int n1 = 10;
//        int n2 = 3;
//        double r = (double) n1/n2;
//        System.out.print(r);
//
//        System.out.println((float)n1/n2);

        int d1 = 45;
        int d2 = 7;
        double e = (double) d1/d2; //자동형변환 d1과 d2 중 하나만 d1만 형변환하면 d2가 자동형변환됨
        double e1 = d1/(double)d2;
        System.out.println(e);
        System.out.println(e1);

        System.out.println((float) d1/d2);
        System.out.println((double) d1/d2);



        //10을 3으로나눠서 소수점이 나타나도록 해주세요
        //3.0이 나오지 않도록 해주세요.


    }
}
