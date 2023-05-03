package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = { "♠", "♥", "♣", "♦" };
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;

    public CardDeck() {

        this.cardList = new ArrayList(); //this.은 선택
        for(String pattern : PATTERNS) {
            for(int i=1; i<=CARD_COUNT;i++) {
                this.cardList.add(new Card(pattern, getDenomination(i))); //cardList에 Card(pattern, Denomination)을 만들어서 넣는다.
            }
        }
    }

    private int getRandomIdx() {
        return (int)(Math.random()*cardList.size()); //+1 안하는 이유 배열은 0부터 시작
    }

    public Card getCard() {
        int ridx = (int)(Math.random()*cardList.size()); //52적지 말고 cardList.size() 이용

//        Card removeIdx = cardList.remove(ridx); //밑에처럼하면 불필요함
//        return cardList.remove(ridx); //getRandomIdx() 안만들고 쓰는 방법
        return cardList.remove(getRandomIdx()); // getRandomIdx() 이용하는 방법

    }

    public void showSize() {
        System.out.println(cardList.size());
    }
    private String getDenomination(int num) {
        switch(num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);
        }
    }
}
