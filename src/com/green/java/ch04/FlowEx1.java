package com.green.java.ch04; //p137

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d 일 때, 참인 것은 \n", x);
        /*조건식()이 true면 {} 안의 문장을 실행
        한 줄로 적는다면 {} 생략 가능.
         */
        if(x == 0) { System.out.println("x == 0"); }
        if(x != 0) { System.out.println("x != 0"); }
        if(!(x == 0)) { System.out.println("!(x == 0)"); }
        if(!(x != 0)) { System.out.println("!(x != 0)"); }
    }
}