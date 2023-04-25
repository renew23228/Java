package com.green.java.ch07.poly;//p354 다형성, 상속관계에서만 의미 있음
/*
1.부모타입은 자식 객체 주소값 저장할 수 있다.
2.자식타입은 부모 객체 주소값 저장할 수 없다.
3.타입은 메소드를 호출할 수 있나없나만 결정 > 실제 실행되는건 객체 기준이다.
3-1 타입은 알고 있는 메서드만 호출할 수 있음 (12줄주석)
 */
public class Poly {
    public static void main(String[] args) {
        Animal ani1 = new Dog(); //Animal과 Dog가 상속관계라서 타입이 달라도 주소값 저장 가능
        ani1.crying();
        //ani1.jump(); //부모인  Animal 타입은 jump메서드를 모르니깐 호출할 수 없음. *3-1
        //부모는 자식의 존재를 모름. 자식만 부모의 존재를 안다.//자식이 부모와 같거나 더 커질 순 있어도 작아질 순 없음
        Dog dog1 = (Dog)ani1;
        dog1.crying();
        dog1.jump();
    }
}
