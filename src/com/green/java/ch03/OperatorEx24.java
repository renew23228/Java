package com.green.java.ch03; // p114

public class OperatorEx24 {
    public static void main(String[] args) {
        // && and 연산자: 둘 다 true여야 true. 둘 이상 일 때 하나라도 false면 false
        // || or 연산자
        // (2 > 1) && (3 > 2)
        // (2 > 1) && (3 >2) && (3 >= 5)

        // (2 > 1) || (3 > 2) || (3 >= 5) // or연산자는 전부다 false여야 false. 하나라도 true면 true

        boolean r1 = (2 > 1) && (3 > 2);
//        System.out.println("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\b", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);

        /* p118
        *and. or연산자는 배치가 중요(퍼포먼스 측면)
        and연산자는 false가 될 것을 앞쪽에 배치하는게 좋다. false뜨면 그 뒤로는 작업 안함
        or연산자는 true가 될 것을 앞쪽에 배치하는게 좋다. true 뜨면 그 뒤로는 작업 안함
         */
    }
}
