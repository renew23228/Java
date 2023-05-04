package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private List<Card> cardList;

    public User() { //기본 생성자
        cardList = new ArrayList<>();
    }
    public void receiveCard(Card c) {
        cardList.add(c);
    }

    public List<Card> openCards() { //타입이 List<Card> 임!
        return cardList;
    }

    public void showCards() {
        System.out.println("[ 현재 보유 카드 목록 ]");
        for(Card c : cardList) {
            System.out.println(c);
        }
        /*
        [ 현재 보유 카드 목록 ]
        Card { 패턴, 숫자 }
        Card { 패턴, 숫자 }
        Card { 패턴, 숫자 }
         */
    }

    protected int getPointSum() {
        int sum = 0;
        for(Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;

        /* teacher Rule클래스의 getScore()를 스태틱으로
        return Rule.getScore(cardList);
         */

        /* MY
        int sum = 0;
        for(int i=0;i< cardList.size();i++) {
            sum += Integer.parseInt(cardList.get(i).getDenomination());
        }
        return sum;

         */
    }

    private int getDenominationToNum(Card c) {
        switch(c.getDenomination()) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }



}
