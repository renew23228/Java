package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;

        double d = 10.2;
        Double d2 = d;

        //generic 제네릭. int형으로 받고 int형으로 뱉어냄
        ArrayList<Integer> list = new ArrayList<>();
//        list.add("11");
//        list.add(10.1);
//        list.add(true;
        list.add(10); //ArrayList에 값 10을 담는다.
        list.add(13);

        int n1 = list.get(0); //0,1번방만 있는데 2번방 요구하면 에러.
        System.out.println(list); //toString 오버라이딩
    }
}
