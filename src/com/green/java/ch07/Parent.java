package com.green.java.ch07;

public class Parent extends Object { //extends를 안적으면 자동적으로 Object를 상속받도록함
    int age;

    public Parent() {
        System.out.println("-- Parent 기본 생성자 --");
    }
}
