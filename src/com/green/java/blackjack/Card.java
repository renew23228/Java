package com.green.java.blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //점수

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override //오버라이딩 조건 : 선언부가 동일해야함(리턴타입, 메서드이름)
    public String toString() {
        return "Card { "+ pattern +", "+ denomination+ "}";


//        retrun String.format("Card { %s, %s }" ,
//                this.pattern, this.denomination);
    }

//    public void showCards() {
//        System.out.println("[ 현재 보유 카드 목록 ]");
//        System.out.printf("Card { %s, %s }%n", pattern, denomination);
//    }

}
