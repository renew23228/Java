package com.green.java.ch07.abstract2;
/*추상메서드가 있을 때는 class 앞에 abstract를 무조건 붙여야함.
  추상메서드가 없을 때도 abstract 붙이는 이유는 객체화하지 못하게 하려고
  AbstractClassTest1 5줄

  추상클래스는 객체화가 안되니깐 무조건 자식이 있음.
 */
public abstract class AbstractClassStudy1 {

    int multi(int n1, int n2) { //추상클래스는 추상메서드가 아닌 것도 가질 수 있음
        return n1 * n2;
    }
    abstract void sum(int n1, int n2);
}

class ChildClass extends AbstractClassStudy1 {
    //강제성이 있어서 오버라이딩 무조건 해야함
    @Override
    void sum(int n1, int n2) {
        System.out.println("합계 : "+(n1+n2));
    }
}

class Child2Class extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : "+(n1+n2));
    }
}