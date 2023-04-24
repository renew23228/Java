package com.green.java.ch06;

class NumberBox {
    int num;
}
public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num); //10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num);//10

        NumberBox nb2 = new NumberBox();
//        NumberBox result = changeNum3(nb2);
        System.out.println("nb2.num : " + nb2.num);
//        System.out.println("result.num : "+ result.num);
    }

    static void changeNum(int num) {
        num = 20;
    }
    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }
    static void changeNum3(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 30;
//        return nb2;

    }
}
