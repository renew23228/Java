package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100); //1번 자리에 100을 대입한다.
        list.add(0,300); //0번 자리에 100을 대입한다.
        System.out.println(list);

        int removeValue = list.remove(4); //인덱스4 번방 지우고 그 값도 removeValue로 리턴해줌
        System.out.println("removeValue : "+ removeValue);

        System.out.println(list);

        System.out.println(list.size()); //size메서드(리턴메서드 int타입)

        list.clear(); //전체삭제
        System.out.println(list);
    }
}
