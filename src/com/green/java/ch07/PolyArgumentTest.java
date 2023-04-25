package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv); // Tv을(를) 100만원에 구매하였습니다.
        buyer.buy(com); // Computer을(를) 200만원에 구매하였습니다.

        buyer.printState(); //나의 남은 돈은 700만원 입니다. 보너스 점수는 %,d점 입니다.

    }
}
class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;
    }

    public void buy(Produckt p) {
//        int producktPrice = p.getPrice();
//        money = money - producktPrice;
        money -= p.getPrice(); //위 두 줄을 한 줄로 줄임. 가진 돈에서 구매한 제품 가격을 차감
        bonusPoint += p.getPrice()*0.1;
        System.out.printf("%s을(를) %d만원에 구매하였습니다.%n",p.toString(), p.getPrice());
    } //p.toString()에서 .toString() 안적어도 ok.

    public void printState() {
        System.out.printf("나의 남은 돈은 %,d만원 입니다. 보너스 점수는 %,d점입니다.%n",money,bonusPoint);
    }
}


class Produckt {
    protected int price;
    protected int bonusPoint;

    Produckt(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }


    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

class Tv2 extends Produckt {
    public Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Produckt {
    public Computer() {
        super(200); //부모(Produckt)가 기본생성자가 없으니 있는 생성자를 호출해야함
    }
    public String toString() { //Object에 있는 메소드 toString를 오버라이딩 한거
        return "Computer";
    }
}