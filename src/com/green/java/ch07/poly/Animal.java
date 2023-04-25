package com.green.java.ch07.poly;

public class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void crying() {
        System.out.println("동물이 운다");
    }
}
class Dog extends Animal {
    public Dog() {
        super("바둑이");
    }
    public Dog(String name) {
        super(name);
    }
    @Override //@로 시작하는것들은 에노테이션.에노테이션 항상 붙이기. 오버라이딩은 부모가 가진 메서드랑 똑같아야함
    public void crying() {
        System.out.println("멍~ 멍~");
    }

    public void jump() {
        System.out.println("개가 점프!!");
    }

}

class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("으르렁!!");
    }

}
class Cat extends Animal {
    public Cat() {}
    @Override
    public void crying() {
        System.out.println("야옹 야옹");
    }

}
class Duck extends Animal {
    public Duck() {}
    @Override
    public void crying() {
        System.out.println("꽥 꽥");
    }

}



