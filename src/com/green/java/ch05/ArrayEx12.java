package com.green.java.ch05; //p207 예제
//p166 향상된 for 문(foreach 문). 순서가 있는 애들만 쓸 수 있음
public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Y1" };
        for(int i=0;i<names.length;i++) {
            System.out.printf("names[%d]: %s%n", i, names[i]);
        }
        names[0] = "Yu";
        //조건식 안적어도되고 . 인덱스값은 못씀
        for(String nm : names) {
            System.out.println(nm);
        }
    }
}
