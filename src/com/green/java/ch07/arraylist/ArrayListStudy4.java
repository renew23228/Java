package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStudy4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 50); //1번 인덱스의 값을 50으로 set

        System.out.println(list.contains(20)); //컬렉션 안에 값 20을 갖는 인덱스가 있는지 있다면 true. 없다면 false

        System.out.println(list);

        //Wrapper클래스.

        Integer[] arr2 = {10, 20, 30};
        System.out.println(Arrays.asList(arr2).contains(10));
    }
}
