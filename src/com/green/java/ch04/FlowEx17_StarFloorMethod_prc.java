package com.green.java.ch04;

public class FlowEx17_StarFloorMethod_prc {
    public static void main(String[] args) {
        int star = 5;

//        printStarLine(star); // *****(개행)
//        printStarLine(3); //을 찍으면 ***(개행) 해서 출력하게끔

        printStarRect(3);
        ///***
        ///***
        ///***
    }


    /*
    //printStarLine(int star)의 int star는 public static void printStarLine(int star){
    } 안에서만 살아있기 때문에 int ss해도 ok
     */
    public static void printStarRect(int star) {
        for(int i=0;i<3;i++) {
            for(int z=0;z<3;z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}


        /*
        *
        **
        ***
        ****
        *****
         */

