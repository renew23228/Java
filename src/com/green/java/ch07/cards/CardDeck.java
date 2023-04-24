package com.green.java.ch07.cards;

import java.util.Arrays;

public class CardDeck {
    Card[] cards; // Card[] cards = [52]; 가능하지만 안함
    int idx;
    CardDeck() {
        cards = new Card[52];
//        for(int i=0;i<cards.length;i++) {
//            cards[i] = new Card("", "");
//        }
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                String num = null;
                switch (z) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(z); //z+""; -> String.valueOf(z); 바꾸기//정수를 문자열로 바꿈
                }
                cards[idx++] = new Card(Card.KINDS[i], num);
//                cards[i*Card.NUM_MAX + z] = new Card("",""); //이거 쓰기보단 11줄~27줄 쓰는게 좋음
            }
        }
    }
    void openCards() {
        for (Card c : cards) {
            System.out.println(c);
//            System.out.println(c.kind + ", " + c.num);
        }
    }
    void shuffle() { //ArrayQuiz12_swap
        int i=0;

        for(i=0;i<cards.length;i++) {
            int rIdx=(int)(Math.random()*cards.length); //Math.random()*numArr.length 에 () 씌우기

            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
//        System.out.println(Arrays.toString(cards));
    }

    Card pick() {
        if(idx == cards.length) {return null;} //예외처리. 에러 안터지게 하기위해
        Card tmp = cards[idx];
        cards[idx] = null;
        idx++; // 61줄 안적고 60줄을 cards[idx++] = null; 해도됨
        return tmp;
    }
}