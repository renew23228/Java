package com.green.java.ch01;

public class DateTest {
    public static void main(String[] args) {
        int y = 2023, m = 11, d = 2;

        String sMon = String.valueOf(m);
        if(m<10) {
            sMon = "0"+sMon;
        }
        String sDay = String.valueOf(d);
        if(d<10) {
            sDay = "0" + sDay;
        }

        System.out.printf("%s-%s-%s", y, sMon, sDay);
    }
}
//        //p39 %전체자리.소수점아래자리f
//        String strDate = String.format("%d-%02d-%d",y,m,d); //%02d
//        System.out.println(strDate); //"2023-12-27"
