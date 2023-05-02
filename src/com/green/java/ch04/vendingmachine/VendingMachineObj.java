package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineObj {
    private int money;
    private List<Drink> list = new ArrayList<>(); //List는 인터페이스. 이걸 구현한게 어레이리스트 링크드리스트

    public VendingMachineObj() {
        list = new ArrayList<>();
        list.add(new Drink(1000, "콜라", "코카콜라", 500));
        list.add(new Drink(1500, "사이다", "칠성\t", 450));
        list.add(new Drink(2000, "환타", "코카콜라", 500));
    }

    public void purchaseDrink(int num) {
        money -= list.get(num-1).getPrice();
        System.out.printf("%s을(를) 구매하였습니다.%n", list.get(num-1).getNm());
        /*
        Drink d = list.get(num-1);
        System.out.printf("%s을(를) 구매하였습니다.%n",
                d.getNm());
        money -= d.getPrice();
         */
    }
    public void showMenus() {
        System.out.println("번호 \t 메뉴명 \t 가격 \t 회사 \t 용량");
        for(int i=0;i<list.size();i++) {
            System.out.printf("%d. \t %s \t %,d \t %s \t %dml%n",
                    i+1, list.get(i).getNm(), list.get(i).getPrice(), list.get(i).getCompany(), list.get(i).getMl());
        }

        /* 선생님 코드
        int num = 1;
        for(Drink d : list) {
            System.out.printf("%d, \t %s \t %,d원 \t %s \t %,dml%n"
            , num++, d.getNm(), d.getPrice(), d.getCompany(), d.getMl());
            }
         */
    }

    public void insert(int insertMoney) {
        this.money += insertMoney;
    }

    public void showMoney() {
        System.out.println("money : "+ this.money); //this 안붙여도되지만 붙여도됨
    }
}
