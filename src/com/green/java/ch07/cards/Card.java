package com.green.java.ch07.cards;

import com.green.java.blackjack.CardDeck;

public class Card extends CardDeck {
    static final String[] KINDS = { "CLOVER", "HEART", "DIAMOND", "SPADE"};
    static final int NUM_MAX = 13; // 무늬별 카드 수

    String kind; //무늬
    String num; //번호 (A 2~10, J, Q, K)
    /*
    외부에서 무늬, 번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들기
     */

//    Card() {} //기본생성자 일부러 뺀 경우라서 주석처리함
    Card(String kind, String num) {
        super(); //부모의 기본생성자 호출. 적지 않아도 자동적으로 입력됨. 무조건 첫째줄에 있어야함
        this.kind = kind;
        this.num = num;
    }
    @Override
    public String toString() {
        return "kind:" + kind + ", num: " + num;
    }
}
