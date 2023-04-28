package com.green.java.ch04;

public class VendingMachine {
    private int money;

    public void insert(int money) {
        this.money += money;
        return;
    }

    public void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.%n",money);
    }

//    public int play() {return money;}

}
