package com.green.java.ch06;

import com.sun.jdi.Value;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);

//        ValueBox = new ValueBox();
//        vb.num=10;
//        System.out.println(vb.toString()); //객체주소값을 가진 vb가 적히면 .toString() 기본적으로 적힘
    }
}

class ValueBox {
    int num;
    @Override
    public String toString() { return String.valueOf(num); }



}
