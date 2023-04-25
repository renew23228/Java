package com.green.java.ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        p.method();
        c.method(5);
    }
}

class Parent3 {
   protected int x = 100;
   void method() {
       System.out.println("Parent Method");
   }
}

class Child3 extends Parent3 {
    private int x = 200;
    void method(int x) {
        System.out.println("x = "+ x); //제일 가까운 x. 만약 void method(int x)라면 들어온 int x값을 씀
        System.out.println("super.x = "+super.x);
        System.out.println("super.x = "+this.x);
    }
}
