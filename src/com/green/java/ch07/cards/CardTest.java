package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("----------");
        cd.shuffle();
        cd.openCards();
        System.out.println("----------");

        Card c1 = cd.pick();
        System.out.println(c1.kind +", "+c1.num);

        System.out.println("----------");

        for(int i=0; i<cd.cards.length;i++) { //카드52장 다 뽑아서 주는것
            cd.pick();
        }

        System.out.println("----------");
        cd.openCards();
    }
}
