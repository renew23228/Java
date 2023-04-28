package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {
        OperatorEx32Quiz1 mm = new OperatorEx32Quiz1();
        // MyMethod mm = new MyMethod();

        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        absX = mm.getAbs(x);
        absY = mm.getAbs(y);
        absZ = mm.getAbs(z);

        System.out.println("absX : "+ absX);
        System.out.println("absY : "+ absY);
        System.out.println("absZ : "+ absZ);

    }
    public int getAbs(int num) { //클래스메서드(static메서드)는 객체생성 없이 호출 가능
        if(num < 0) {
            return -num;
        }
            return num;

        //return n >= 0 ? n : -n; //삼항식
    }

}


