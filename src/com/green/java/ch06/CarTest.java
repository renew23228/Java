package com.green.java.ch06;
/*

 */
public class CarTest {
    // CarTest는 Car클래스를 Test하기 위해 static void main 메인메서드를 담기위한 클래스임
    public static void main(String[] args) {
        Car.brand = "하하";
        System.out.println(Car.brand);

        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "쉐보레";
        c1.model = "트레버스";
        c1.price = 4500;

        c2.brand = "페라리";
        c2.model = "엔초페라리";
        c2.price = 40_000;

        Car.brand = "현대"; //실제로는 static은 이렇게 쓰는거

        c1.printInfo();
        c2.printInfo();

        System.out.println(c1.brand);
        System.out.println(c2.brand);
    }
}
