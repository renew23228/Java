package com.green.java.ch07.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("뽀삐");
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        PolyQuiz1.animallCryingCall(dog1); // PolyQuiz1. 생략해도됨
        PolyQuiz1.animallCryingCall(bd1);
        animallCryingCall(cat1);
        animallCryingCall(duck1);
    }
    static void animallCryingCall(Animal ani) {
        ani.crying();
        if(ani instanceof Dog) { //들어온 값이 Dog타입으로 형변환 가능하다면
            Dog dog = (Dog)ani;
            dog.jump();
        }

    }

}
