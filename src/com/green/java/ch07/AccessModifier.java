package com.green.java.ch07;
//p348 접근제어자
public class AccessModifier {
    /* default는 실무에서 사용안함
    private, default, protected, public (오른쪽으로 갈수록 접근 범위가 넓어진다)
    메서드 앞엔 4개 다 들어갈 수 있음. 클래스엔 디폴트, 퍼블릭만
    파일명과 똑같은 클래스에 public 붙일 수 있음.

    private: 같은 클래스 {}안에서만 접근가능
    default: privat(같은 클래스) + 같은 패키지 안에서만 접근가능
    protected:같은 클래스 + default(같은 패키지)+ 패키지가 달라도 상속관계에서만 접근가능

    멤버필드 중 상수는 public붙어도됨?
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
//        mt1.num1 = 10; //값을 못넣음
        mt1.num2 = 20;
        mt1.num3 = 30;
        mt1.num4 = 40;
    }
}
