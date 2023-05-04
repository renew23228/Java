package com.green.java.ch07.abstract2;

public class Fighter implements Runable { //Runable만 상속받아도 Fightable, CanFly상속한거랑 같음
    //Runable 상속한 후 Runabled의 메서드 구현하려면 Fighter 마우스 올리고 implements 클릭
    public void jump() {
        System.out.println("점프");
    }

    @Override
    public void run() {

    }
    @Override
    public void move(int x, int y) {
        System.out.println("파이터 sum : "+(x+y));
    }

    @Override
    public void sum(int x, int y) {
        System.out.printf("좌표 %d, %d 로 이동%n", x, y);
    }

    @Override
    public void fly() {

    }
}

class Fighter2 implements Fightable {


    @Override
    public void sum(int x, int y) {

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("좌표 %d, %d 로 이동%n", x, y);
    }
}