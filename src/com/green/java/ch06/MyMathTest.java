package com.green.java.ch06;

public class MyMathTest { //MyMathStatic, MyMathInstance 같이보기
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;

        MyMathInstance c= new MyMathInstance(); //static이 안붙어 있으니 클래스를 객체화해서 사용
        int result=c.sum(n1,n2);
        System.out.println(result);

        int result1=MyMathStatic.sum(n1,n2);
        System.out.println(result1);

        //MyMathInstance 클래스에 있는 sum메소드
        /*
        이용하여 n1, n2 값을 더한 결과를 콘솔에 출력

        MyMathStatic 클래스에 있는 sum메소드
        이용하여 n1, n2값을 더한 결과를 콘솔에 출력
         */
    }
}
