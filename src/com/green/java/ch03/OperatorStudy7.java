package com.green.java.ch03; // 책엔 예제가 없음

public class OperatorStudy7 {
    public static void main(String[] args) {
        //미만, 초과 <>
        //이하, 이상 <=, =>

        System.out.println("2 < 2 : " + (2 < 2)); // 2는 2미만이냐
        System.out.println("2 <= 2 : " + (2 <= 2)); // 2는 2이하냐
        System.out.println("2 <= 2 : " + (2 <= 2));
        System.out.println("1 <= 2 : " + (1 <= 2));
        System.out.println("2 > 2 : " + (2 > 2));
        System.out.println("2 == 2 : " + (2 == 2));
        System.out.println("2 == 3 : " + (2 == 3));
        System.out.println("2 != 3 : " + (2 != 3));
        System.out.println("2 != 2 : " + (2 != 2));
        System.out.println("!(2 != 2) : " + !(2 != 2)); // ()앞에 !는 논리연산자임. ! 뒤에는 boolean타입만 온다

    }
}
