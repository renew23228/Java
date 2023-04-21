package com.green.java.ch04;

import java.util.Scanner;
/* swithc 사용하여
        mon 값이
        3, 4, 5라면 "봄"
        6, 7, 8라면 "여름"
        9, 10, 11이라면 "가을"
        12, 1, 2이라면 "겨울"
        이외의 값은 null 리턴 return null;
         */

class SeasonObj {
    String getSeason(int mon) {
        switch(mon) {
            case 3:
            case 4:
            case 5:
                return "봄"; //3,4,5면 봄 데리고 가서 종료되니 break; 필요없음
//                break;
            case 6:
            case 7:
            case 8:
                return "여름";
//                break;
            case 9:
            case 10:
            case 11:
                return "가을";
//                break;
            case 12:
            case 1:
            case 2:
//                return null;
                return "겨울";
//                break;
            default:
                return null;
        }
//        return null;
        /*아래 두 줄 대신 return null;해도됨
        default:
                return null;
         */
    }
}

public class FlowEx6Method {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. (1~12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        SeasonObj so = new SeasonObj();
        String result = so.getSeason(mon);

        if(result == null) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.printf("현재의 계절은 %s입니다.", result);
    }
}
