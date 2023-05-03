package com.green.java.ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        p.method();
        c.method();
        c.method(5);
    }
}

class Parent3 {
   protected int x = 100; //실제로는 부모와 자식 클래스에서 변수 이름 똑같은건 지양해야함
   void method() {
       System.out.println("Parent Method");
   }
}

class Child3 extends Parent3 {
    private int x = 200;
    void method() {
        System.out.println("Child Method");
        super.method();
    }
    void method(int x) {
        System.out.println("x = "+ x); //제일 가까운 x임 c.method(5);의 5. 만약 void method(int x)라면 들어온 int x값을 씀
        System.out.println("super.x = "+super.x);
        System.out.println("super.x = "+this.x);
    }
}
