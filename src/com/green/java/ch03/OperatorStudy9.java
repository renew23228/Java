package com.green.java.ch03; // p133

public class OperatorStudy9 {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println("i : " + i);

        int z = 0;
        z = z + 1; // 0+1
        z = z + 1; // 1+1
        z = z + 2; // 2+2
        System.out.println("z : " + z);

        int k = 0;
        k += 1; //  z = z + 1;와 같음
        k += 2; //  z = z + 2;와 같음
        System.out.println("k : " + k);
    }
}
