package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        int num = 9;
        if(num == 10) {
            System.out.println("num은 10입니다.");
        } else {
            System.out.println("num은 10이 아니다.");
        }
        /*if와 else는 하나만 , else if는 무제한 가능.
        else문은 조건식 없어도 되지만 나머지는 있어야함
        if, else if, else는 순차적으로 실행하고 true만나면 빠져나옴
         */
        int num2 = 10;
        if(num2 >= 20) {
            System.out.println("num2는 20이상");
        } else if(num >= 10) {
            System.out.println("num2는 10이상");
        } else if(num >= 5) {
            System.out.println("num2는 5이상");
        } else {
            System.out.println("num은 5미만");
        }

        System.out.println("끝!");
    }
}
