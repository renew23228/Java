package com.green.java.ch07.abstract2;
/*
인터페이스는 무조건 추상메서드만 적을 수 있음.
다중상속 가능(어차피 내용이 없어서 문제가 안됨)
클래스가 인터페이스를 상속받으려면 implements (extends 아님)
인터페이스가 인터페이스를 상속받으려면 extends
ex) interface Fightable implements 상속받을것이름1, 상속받을것이름2
public abstract 가 자동으로 붙음

인터페이스는 이름규칙이 ~able

 */
public interface Fightable {
    void sum(int x, int y);
    public abstract void move(int x, int y);
}
