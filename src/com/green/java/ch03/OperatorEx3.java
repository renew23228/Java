package com.green.java.ch03; // p94

public class OperatorEx3 {
    public static void main(String[] args) {
        int i=5, z=5;
        System.out.println(i++); //++이 뒤에 있으면 읽기 먼저함.
        System.out.println(++z); //++이 앞에 있으면 쓰기 먼저
        System.out.printf("i=%d, z=%d\n", i, z);

        int k = 5;
        int r = k++ - ++k; //가독성이 안좋아 안쓰지만 생각해보자는 취지. k++는 읽기 먼저하니깐 5 -> ++k는 쓰기 먼저니깐 k++가 지금은 적용한거니 6에서 +1되니깐 7. 즉 5 - 7
        System.out.println(r);

    }
}
