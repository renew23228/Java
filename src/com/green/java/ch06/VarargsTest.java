package com.green.java.ch06;

public class VarargsTest {
    public static void main(String[] args) {
        sum(1); //sum:1
        sum(1,2); //sum:4
        sum(1,2,3);//sum:7
        sum(1,2,3,4,5,6,7,8,9,10);//sum:55

        int[] arr = {1,2,3};
        sum(arr);


    }

    static void sum(int... nums) { //jvm이 알아서 정수형 배열로 만들어서 넣어줌
        System.out.println(nums.length);
        int sum =0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i]; //sum += nums[i];
//        }
        for(int val : nums) { //16~18줄 대신 foreach문 쓰면 더 간단함. nums.length만큼 알아서 반복함
            sum += val;
        }
        System.out.println("sum: " + sum);
    }
}
