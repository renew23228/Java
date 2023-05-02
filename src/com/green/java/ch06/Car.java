package com.green.java.ch06;

public class Car {
    static String brand;
    String model;
    int price;

    static void powerOn() { //객체화 없이 사용할 수 있음. 속도가 빠름
        //static메서드에서는 iv를 사용할 수 없지만 사용하려면 객체화 후 사용가능
//        Car c = new Car();
//        c.model = "현대";
        System.out.printf("%s 차의 모델명 %s 시동 걸림"
                , brand); //static메서드(클래스메서드)에서는 iv쓸 수 없음 but 반대의 경우는 ok
    }

    void printInfo() {
        System.out.printf("brand: %s, model : %s, price: %d%n"
                , brand, model, price);
    }
}
