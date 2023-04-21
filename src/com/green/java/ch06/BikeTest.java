package com.green.java.ch06;

public class BikeTest {
    public static void main(String[] args) {
        Bike b1 = new Bike("혼다"); //new Bike(); : new키워드로 생성자 호출


        Bike b2 = new Bike("야마하");

        System.out.println("b1.brand : "+b1.brand);
        System.out.println("b2.brand : "+b2.brand);
    }
}
