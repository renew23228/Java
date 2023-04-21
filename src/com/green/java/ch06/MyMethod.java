package com.green.java.ch06;

public class MyMethod {

    // void sum(int n1, int n2) :메서드 선언부

    //{
    //        System.out.println(n1+n2);
    //    } : 메서드 구현부

    //선언부와 구현부 2개가 있으면 메서드 정의 했다는 의미
    /*
    void :리턴 타입 //void면 void메서드이고 값을 뱉어내지 않음 /void가 아니면 return메서드이고, return메서드는 무조건 값을 뱉어낸다
    sum : 메서드명
    (int n1, int n2) : 파라미터(매개변수). 외부에서 값을 받을 수 있음(값들이 들어올 수 있는 문 같은거)
     */
    void sum(int n1, int n2) { // void는 혼자 쓰여야함 =이나 이런게 있으면 안됨

        System.out.println(n1+n2);

    }

    //모든 메서드는 return키워드(return;)를 만나야 돌아가는데  void메서드는 안적으면 자동으로 적어줌. 메서드 종료개념
    int sum2(int n1, int n2) { return n1 + n2; }
    //return메서드는 return키워드가 필수. return키워드 만나면 값을 데리고 돌아감

}
