package com.green.java.ch07;

import java.util.Arrays;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.buy(new Audio3());
        b.summary();
        //구입하신 제품은 Tv, Computer, Audio, Audio 총 4개 입니다. 출력


    }
}
class Buyer3 {
    private int money;
    private int bonusPoint;
    private Produckt3[] items; //tv computer audio를 배열에 담기 위해서 부모(Produckt3)배열 생성(?)
    private int idx;
//    private String inventory;

    public Buyer3() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.items = new Produckt3[10];
        this.idx = 0; //Produckt3 배열방에 구매할 때마다 각 방에 주소값 넣기 위해
        printState();
    }

    public void summary() {
//       //내가그냥한거 for(int i=0;i<=idx;i++) {} //구입한거 들어가는 배열 만들어서 구입한거만큼만 그 배열에 주소값 넣기
//        String inventory = Arrays.toString(items);
//        System.out.printf("구매하신 제품은 %s 총 %d개 입니다.",
//                inventory, idx);
        System.out.print("구입하신 제품은 ");
        if(idx > 0) {
            System.out.printf(" %s", items[0]);
            for(int i=1;i<idx;i++) {
                System.out.printf(", %s", items[i]);
            }
        }
        System.out.printf(" 총 %d개 입니다.", idx);
    }
    public void buy(Produckt3 p) {

//        for(int i=0;i<items.length;i++) { //items.length 잊지않기
//            if(items[i]==null) {
//                items[i]=p;
//                break;
//            }
//        } for문 이용은 좋은 방법은 아님

        this.items[idx++] = p; //iv로 int idx; 선언한 후 이용
//        int producktPrice = p.getPrice();
//        money = money - producktPrice;
        money -= p.getPrice(); //위 두 줄을 한 줄로 줄임. 가진 돈에서 구매한 제품 가격을 차감
        bonusPoint += p.getBonusPoint();

        System.out.printf("%s을(를) %d만원에 구매하였습니다.%n",p.toString(), p.getPrice());
    } //p.toString()에서 .toString() 안적어도 ok.

    public void printState() {
        System.out.printf("나의 남은 돈은 %,d만원 입니다. 보너스 점수는 %,d점입니다.%n",
                money,bonusPoint);
    }
}


class Produckt3 {
    protected int price;
    protected int bonusPoint;

    Produckt3(int price) {
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

class Tv3 extends Produckt3 {
    public Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Produckt3 {
    public Computer3() {
        super(200); //부모(Produckt)가 기본생성자가 없으니 있는 생성자를 호출해야함
    }
    public String toString() { //Object에 있는 메소드 toString를 오버라이딩 한거
        return "Computer";
    } //부모(produckt)가 toString 메서드 없으니 모든객체의 부모인 Object의 메서드임
}

class Audio3 extends Produckt3 {
    public Audio3() { super(50); }
    public String toString() { return "Audio"; }
}