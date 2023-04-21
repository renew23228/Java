package com.green.java.ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "소나타";

        Car.brand = "기아";
        Car.powerOn();

//        Integer.parseInt("11"); //static 메서드는 객체생성하지 않고 실행할 수 있음
    }
}
