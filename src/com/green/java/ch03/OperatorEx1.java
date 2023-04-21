package com.green.java.ch03;

public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5; //변수의 값을 변경할 수 있는거 ++, = 뿐임
        i++; //6. 원래 가진 값에서 1 올림. 앞에 쓰거나 뒤에 쓸 수 있음. -- 도 같음
        i++; //7
        System.out.println(i);

        i = 5;
        ++i;
        System.out.println(i);
    }
}
