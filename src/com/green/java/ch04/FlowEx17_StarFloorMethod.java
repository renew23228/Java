package com.green.java.ch04;

public class FlowEx17_StarFloorMethod {
    public static void main(String[] args) {
        int star = 5;

        printStarLine(star); // *****(개행)
        printStarLine(3); //을 찍으면 ***(개행) 해서 출력하게끔
        System.out.println("-----------------------");
        printStarRect(3);
        ///***
        ///***
        ///***
        System.out.println("-----------------------");
        printStarTri(4);
        /*
        *
        **
        ***
        ****
         */

    }

    /*
    //printStarLine(int star)의 int star는 public static void printStarLine(int star){
    } 안에서만 살아있기 때문에 int ss해도 ok
     */
    public static void printStarLine(int star) {
        for(int i=0;i<star;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarRect(int star) {
        for(int i=0;i<star;i++) {
            for(int z=0;z<star;z++) { //38~41줄 대신 printStarLine(star); 가능
                System.out.print("*");
            }
            System.out.println();
        }
        }

    public static void printStarTri(int star) {

        for(int i=0;i<4;i++) { //54~56줄로 줄이기 가능
            for(int z=0;z<i+1;z++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i=1; i<=star; i++) {
//            printStarLine(i);
//        }
    }
}

