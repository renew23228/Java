package com.green.java.ch05;

/* ArrayQuiz3의 값을 이용한 문제
numArr 배열을 이용하여

모든 방의 값을 더해서 출력해주세요.
sum: ??
 */
public class ArrayQuiz4 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int i = 0;
        int sum = 0;

        for (i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i]; //sum += numArr[i];
        }
        System.out.println("sum: " + sum);
//        System.out.printf("sum: %d", sum);
    }
}
