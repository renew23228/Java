package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age = 20; /*ch.age는 this.age 나 자신(child)에 age 있는지 찾음 없다면
        parent로 올라가서 거기 age에 20 넣음*/

        System.out.printf("super: %d%n", ch.getSuperAge());
        System.out.printf("this: %d%n", ch.getThisAge());
    }
}
