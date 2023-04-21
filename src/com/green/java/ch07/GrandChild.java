package com.green.java.ch07;

public class GrandChild extends Child {
    public GrandChild() {
        super(); /*super(); super는 직속 부모(child)를 뜻함. 무조건 첫 줄에 있어야함. 밑으로 내리면 x
        그래서 gc기본 생성자 보다 child 기본생성자가 먼저 찍힘.안적어도 컴파일러가 자동으로 적어줌
        */
        System.out.println("-- GrandChild 기본 생성자 --");
    }
}
