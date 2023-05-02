package com.green.java.ch04.vendingmachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMenus();
        vm.purchaseDrink(3); //콜라를 구매하였습니다. (money값은 -1000 처리)
        vm.purchaseDrink(1);
        vm.purchaseDrink(4);
        /*
        번호 \t 메뉴명 \t 가격
        1. \t 콜라 \t 1,000
        2. \t 사이다 \t 1,500
        3. \t 환타 \t 2,000
        4. \t 미란다 \t 2,500

         */
        vm.showPurchaseList();
        //콜라, 콜라, 콜라을(를) 구매하였습니다.
        vm.showMoney(); //현재 잔액은 40,000원입니다.
    }
}
