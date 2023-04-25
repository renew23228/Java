package com.green.java.ch07;
//p348 접근제어자
public class AccessModifier {
    /* default는 실무에서 사용안함
    private, default, protected, public (오른쪽으로 갈수록 접근 범위가 넓어진다)

    private: 같은 클래스 {}안에서만 접근가능
    default: privat(같은 클래스) + 같은 패키지 안에서만 접근가능
    protectec: default(같은 패키지)+ 상속관계에서만 접근가능
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
//        mt1.num1 = 10; //값을 못넣음
        mt1.num2 = 20;
        mt1.num3 = 30;
        mt1.num4 = 40;
    }
}
