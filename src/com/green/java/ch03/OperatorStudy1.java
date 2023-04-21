package com.green.java.ch03;

public class OperatorStudy1 {
    public static void main(String[] args) {
        int num = 5; // 선언은 한 번만 하고 num 쓸 때는 num 바로 적으면됨
        int result = 4 + num * 3;
        System.out.println(result);

        result = 11 / num;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = 13 % num; // %는 나눴을 때 나머지 값 구하는 것
        System.out.println(result);
    }
}
