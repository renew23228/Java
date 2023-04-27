package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList(); // 객체 생성 후 MyArrayList의 기본생성자 호출(?)


        myList.add(10); //실행시 0개자리 배열를 1개짜리 배열로 만들고 0번칸에 값 10을 대입하기
        myList.add(20);
        myList.add(30);

        myList.add(3,100);
        //실행시 idx3번칸에 값100을 대입하고 기존 인덱스3번칸 포함 이후 칸의 값을 한칸씩 뒤로 밀리게 한다.
        //현재의 배열 길이 보다 큰 idx값을 입력하면 무시하도록 하기
        System.out.println(myList); //[10, 20, 30] //가지고 있는 값 다 출력

        System.out.println(myList.size()); //길이 값 출력

        int v1 = myList.get(0); //특정 idx의 값을 get
        System.out.println(v1);
        System.out.println("-------------");

        for(int i=0;i< myList.size();i++) { //가지고 있는 값을 다 get함.
//            int val =  myList.get(i);
//            System.out.println(val);
            System.out.println(myList.get(i));
        }
        System.out.println("-------------");

        int sum = 0;
        for(int i=0;i< myList.size();i++) {
            sum = sum + myList.get(i);
            //sum += myList.get(i);

            /* 2줄이 위 한 줄과 같음
            int val = myList.get(i);
            sum += val;
             */
        }
        System.out.printf("sum: %d",sum);
    }
}
