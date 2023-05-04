package com.green.java.ch07.arraylist;

import java.util.ArrayList;
//링크드리스트는 노드. 수정이 많을 때(중간에 집어 넣는 등)
//어레이리스트는 배열로 처리(읽기 속도가 빠름)
public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //레퍼런스타입이고 타입이 다른데 주소값을 담을 수 있음 = 상속관계라는 말
        list.add(10); //0번방에 값을 넣음
        list.add(20); //1번방에 값이 들어감
        list.add("ddd");

        Object obj = 10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        Object o1 = list.get(0); //Object로 받았다면 형변환 필요없음
        int n1 = (int)list.get(0); //0번방의 값을 빼냄. 빼낼 때의 리턴타입을 잘 지켜야함
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);
//arraylist는 오브젝트 타입이라서 모든 타입이 다 들어가기 때문에 빼낼때는 타입에 맞춰서 빼내야함 형변환해야함


    }
}
