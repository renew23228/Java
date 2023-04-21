package com.green.java.ch04;
/*
    [1, 1]
          [2, 2]
                [3, 3]
 */
public class FlowEx21_xx {
    public static void main(String[] args) {
        for(int i=1; i<4; i++) {
            for(int z=1; z<4; z++) {
                switch(z=i) {
                    case 1:
                        System.out.printf("[%d, %d]\t", z, i);
                        break;
                    default:
                        System.out.print("      \t");
                }
            }
        }
    }
}
