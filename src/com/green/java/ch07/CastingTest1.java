package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc; //원래는 car = (car)fc; 해야하지만 자동형변환이 일어나기 때문에
        //car와 fc가 타입이 다른데 담을 수 있다? -> 상속관계임
        if(car instanceof FireCar) { //car에 Car객체주소값 들어있다면 에러뜨기 때문에 강제형변환해야함
            fc2 = (FireCar) car;
            fc2.water();
        } else {
            System.out.println("안돼!!");
        }
    }
}

class Car {
    void drive() {
        System.out.println("drive, Brrrrrr");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}