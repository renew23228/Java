package com.green.java.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        for (int i=0;i<2;i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if(dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
        }

        gamer.showCards();

        //Card More? (y/n) > //저 메시지 계속 뜨고 y입력하면 카드 더 뽑고 n누르면 그만
        Scanner scan = new Scanner(System.in);
        while(true) { //n을 입력하기 전까지 반복문이 계속 돌아야하기 때문에
            System.out.print("Card More? (y/n)");
            String input = scan.nextLine();
            if(input.equals("y")) {
                gamer.receiveCard(cd.getCard());
                gamer.showCards();
            } else if (input.equals("n")) {
                break;
            }
        }
//teacher
//        while(true) {
//            System.out.print("Card More? (y/n)");
//            String input = scan.nextLine();
//            if("n".equals(input.trim().toLowerCase())) {
//                break;
//            }
//            gamer.receiveCard(cd.getCard());
//            gamer.showCards();
//
//        }


        System.out.println("---- 딜러 카드 ----");
        dealer.showCards();
        Rule.whoIsWin(gamer, dealer); //클래스이름.메서드이름은 static메서드 호출




    }
}
