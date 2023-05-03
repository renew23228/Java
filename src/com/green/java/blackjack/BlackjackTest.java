package com.green.java.blackjack;

import java.util.List;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

//        Card c = cd.getCard(); //카드를 한장 뽑는다
//        gamer.receiveCard(c); //gamer.receiveCard(cd.getCard()); 로 가능
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

//          풀어쓴거
//        List<Card> cardList = gamer.openCards();
//        int score = rule.getScore(gamer.openCards());

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(dealer.openCards());

        System.out.println(gamerScore); //Gamer가 뽑은 두 장의 카드 숫자 합계
        System.out.println(dealerScore); //Dealer가 뽑은 두 장의 카드 숫자 합계




//      검사용
//        cd.showSize(); //52
//        Card c = cd.getCard();
//        cd.showSize(); //51
//        System.out.println(c.getDenomination()); //랜덤한 주소값인지 알려면 이거 실행했을때 계속 다른값이 나옴
        //카드덱에 있는 랜덤한 카드객체 주소값을 리턴. 리턴한 카드주소값은 카드덱에서 삭제
        //즉, cardList.size() 호출했을 때 콘솔창에 51이 떠야함

    }
}
