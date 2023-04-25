package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
//        fc = (FireCar)car; //자식 타입은 부모 타입의 객체 주소값 저장할 수 없음
    }
}
