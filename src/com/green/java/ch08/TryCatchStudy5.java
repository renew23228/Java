package com.green.java.ch08;

public class TryCatchStudy5 {
    public static void main(String[] args)  {
        //getConnection(); // 마우스 올린 뒤 more actions - surround with~~ 누르면 자동으로 감싸줌

        try {
            getConnection();
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            otherGetConnection();

        } catch(Exception e) {

        }

        otherGetConnection2();
    }

    public static void getConnection() throws Exception {
        System.out.println("DB 연결!!");
    }

    public static void otherGetConnection() throws Exception{
        try {
            getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void otherGetConnection2() {
        try {
            getConnection();
        } catch(Exception e) {

        }
    }
}
