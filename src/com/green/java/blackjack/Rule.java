package com.green.java.blackjack;

import java.util.List;

public class Rule {
    static final int BLACKJACK_SCORE = 21;
    public int getScore(List<Card> cardList) {
        int sum = 0;
        for(Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;

        //메서드 활용안한거
//        int sum =0;
//        int num =0;
//        for(int i=0;i<c.size();i++) {
//            switch (c.get(i).getDenomination()) {
//                case "A":
//                    return 1;
//                case "J":
//                    return 10;
//                case "Q":
//                    return 10;
//                case "K":
//                    return 10;
//                default:
//                    return num = Integer.parseInt(c.get(i).getDenomination());
//            }
//              sum += num;
//        }
//        return sum;
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

    public static void whoIsWin(User gamer, User dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();

        if( gPoint <= BLACKJACK_SCORE && (gPoint > dPoint || dPoint > BLACKJACK_SCORE)) {
            System.out.println("게이머 승리");
        } else if( dPoint <= BLACKJACK_SCORE && (dPoint>gPoint||gPoint>BLACKJACK_SCORE)) {
            System.out.println("딜러 승리");
        } else {
            System.out.println("무승부");
        }


    }
}
