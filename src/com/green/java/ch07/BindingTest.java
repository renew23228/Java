package com.green.java.ch07;
/*
프로그래밍에서는 binding은 연결하다는 의미
 */

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println(p.x); //멤버필드는 private이라서 이렇게 접근할리 없어서 몰라도됨
        p.method(); //Child2에 먼저 가서 method 보기 때문에 chiild method뜸. childd2에 method가 없다면 Parent2로 올라가서 찾음

        System.out.println(c.x);
        c.method(); //Child2에 먼저 가서 method 보기 때문에 chiild method뜸
    }
}

class Parent2 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;
    @Override //이걸 적으면 아래가 오버라이딩이 맞는지 확인해줌.
    void method() {
        System.out.println("Child Method");
    }
}