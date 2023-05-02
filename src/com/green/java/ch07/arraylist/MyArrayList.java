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

    public int size() {
        return items.length;
    }
    public int get(int idx) {
        return items[idx];
    }

    //1- 5번, 2- 4번 , 3- 3번, 4- 2번, 5- 1번
    //비교 0,1 / 1,2/ 2,3/ 3,4/
    //
    //1,2,3,4,5,6 //처음 가로5번 //
    //1,2,3,4,5,6 //가로4
    //1,2,3,4,5,6 //가로3
    //1,2,3,4,5,6 //가로2
    //1,2,3,4,5,6 //가로1
    //
    public void bubbleSort() {
//        int temp = 0; //for 문 안에서 선언해도 되지만 밖이 나음
//        for(int i=items.length-1;i>0;i--) { //i=5;5>0;i-- /총 5번 돌기
//            for(int z=0;z<i;z++) { //z=0;0<5; //줄마다 5번 4번 3번 2번 1번
//                if(items[z]>items[z+1]) {
//                    temp = items[z];
//                    items[z] = items[z+1];
//                    items[z+1] = temp;
//                } else if(items[z]<items[z+1]) {
//                    continue;
//                }
//            }
//        }
        for(int i = items.length-1;i>0;i--) {
            for(int z=0;z<i;z++) {
                int sideIdx = z+1;
                if(items[z]>items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }
    }


}