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
}
