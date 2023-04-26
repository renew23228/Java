package com.green.java.ch07.arraylist;

public class MyArrayList {
    private int[] items;
    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);

    }
    public void add(int value) {
        int[] temp = new int[items.length+1];
        temp[items.length] = value;
        for(int i=0;i<items.length;i++) {
            temp[i] = items[i];
        }
        items = temp;
    }
    public void add(int idx, int value) {
        if(idx>items.length) {
            return;
        }
        int[] temp = new int[items.length+1];

        temp[idx] = value; // temp[]의 int idx자리에 int value값 대입
        for(int i=0;i<items.length;i++) { //기존 만들어진 3칸짜리 items배열길이만큼 for문이 돈다
            if(i<idx) { //i가 int idx보다 작으면 기존 items 자리의 값을  temp에 대입
                temp[i] = items[i];
            } else { //i가 idx보다 크면 기존 item[i] 값을 temp[]의 인덱스값이 기존 item[] 인덱스값보다 +1 큰 자리에 대입
                temp[i+1] = items[i];
            }
        }
        items = temp; //배열 items에 temp배열 객체 주소값을 대입

        //틀린거
//        for(int i=0;i<temp.length;i++) {
//            if(i<idx) {
//                temp[i]=items[i];
//            } else if(i>idx) {
//                temp[i]=items[i];
//            } else if(i==idx) {
//                temp[i]= value;
//            }
//            items = temp;
//        }
    }

    @Override
    public String toString() {
        String str = "[";
        if(items.length>0) {
            str += items[0];
            for(int i=1;i<items.length;i++) {
                str += ", "+items[i];
            }
        }
        str += "]"; //str = str + "]"
        return str;

    }
}
