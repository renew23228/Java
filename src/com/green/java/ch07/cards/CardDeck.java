package com.green.java.ch07.cards;

public class CardDeck {
    Card[] cards; // Card[] cards = [52]; 가능하지만 안함

    CardDeck() {
        cards = new Card[52];
        for(int i=0;i<cards.length;i++) {
            cards[i] = new Card("", "");
        }
    }
}
