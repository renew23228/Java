package com.green.java.ch07;

public class ModifierTest {
    //보통 private, public 많이씀
        private int num1; //클래스의 { } 안에서만 접근가능
        int num2;
        protected int num3;
        public int num4; //멤버필드에 public 붙이는건 상수만. 나머지는 없다고 보면됨. 멤버필드는 private 붙인다고 보면됨

        public void printNum1() {
            System.out.println(num1);
    }
}
