package com.green.java.ch07.arraylist;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.set(1, 50);

        boolean r1 = list.contains(20); //값20이 있는지 찾기 true가 나와야함
        System.out.println("r1 : "+ r1);

        boolean r2 = list.contains(100); //false
        System.out.println("r2 : "+ r2);

        System.out.println(list);
    }
}
