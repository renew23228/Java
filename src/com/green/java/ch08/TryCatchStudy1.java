package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
        try {
            int r1 = 10/0; //예외가 발생해도 멈추지 않음
            System.out.println("다음줄");
            //예외가 발생될 가능성이 있는 로직(source) 위치
        } catch(Exception e) {
            e.printStackTrace(); //에러메시지 보여줌
            System.out.println("예외 발생!");
            //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
        } finally {
            System.out.println("finally");
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
        }
        System.out.println("끝!");
    }
}
