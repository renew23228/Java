package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; //직속관계만 가능. boolean은 if문에서 많이씀
        System.out.println("r1 : "+ r1);
        Bulldog bd1 = (Bulldog) ani1; //강제형변환 가능

        System.out.println("r2 : "+ (ani1 instanceof Cat));
        //Cat c1 = (Cat)ani1; //빨간줄은 안뜨지만 컴파일에러 뜸
    }
}
