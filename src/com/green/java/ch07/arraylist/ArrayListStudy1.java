package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10); //0번방에 값이 들어감
        list.add(20); //1번방에 값이 들어감
        list.add("ddd");

        Object obj = 10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        int n1 = (int)list.get(0);
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);
//arraylist는 오브젝트 타입이라서 모든 타입이 다 들어가기 때문에 빼낼때는 타입에 맞춰서 빼내야함 형변환해야함


    }
}
