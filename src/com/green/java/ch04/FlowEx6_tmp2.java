package com.green.java.ch04;
// FlowEx6와의 차이점 default문 없이 if문에 잘못된 입력 추가한거
import java.util.Scanner;

public class FlowEx6_tmp2 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. (1~12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";
        switch(mon) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
        } if("".equals(season)) {
            System.out.println("잘못 입력하였습니다.");
        } else {
            System.out.printf("현재의 계절은 %s입니다.", season);
        }

        /* swithc 사용하여
        mon 값이
        3, 4, 5라면 "현재의 계절은 봄입니다."
        6, 7, 8라면 "현재의 계절은 여름입니다."
        9, 10, 11이라면 "현재의 계절은 가을입니다."
        12, 1, 2이라면 "현재의 계절은 겨울입니다."
         */
    }

}
