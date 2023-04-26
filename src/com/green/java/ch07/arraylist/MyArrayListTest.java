package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();


        myList.add(10); //실행시 0개자리 배열를 1개짜리 배열로 만들고 0번칸에 값 10을 대입하기
        myList.add(20);
        myList.add(30);

        myList.add(3,100); //실행시 idx3번칸에 값100을 대입하고 기존 인덱스3번칸 포함 이후 칸의 값을 한칸씩 뒤로 밀리게 한다.

        System.out.println(myList); //[10, 20, 30]

    }
}
