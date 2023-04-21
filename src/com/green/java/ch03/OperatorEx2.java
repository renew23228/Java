package com.green.java.ch03; // p94

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        //i++ 값을 복사해서 j로 대입해야하는 상황. 읽기 쓰기 둘 다 해야하는 상황인데 ++이 뒤에 있을 때는 읽기 먼저
        j = i++; // ++이 뒤에 있으면 먼저 읽음 (원래 있던 값 5가 먼저 j로 저장되고 그 다음 ++로 1 올림).
        System.out.printf("j=i++; 실행 후 i=%d, j=%d\n", i, j);

        int i2 = 5, j2 = 0;
        j2 = ++i2; // ++이 앞에 있으면 ++먼저 쓰기
        System.out.printf("j2=++i2; 실행 후 i2=%d, j2=%d\n", i2, j2);

    }
}
