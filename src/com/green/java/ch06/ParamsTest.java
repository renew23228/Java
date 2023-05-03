package com.green.java.ch06;

class NumberBox {
    int num;
}
public class ParamsTest {
    public static void main(String[] args) {
        int num = 10; //10이라는 리터럴값 복사
        changeNum(num);
        System.out.println(num); //10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        System.out.println(nb.num);//10
        changeNum2(nb);
        System.out.println(nb.num);//20

        NumberBox nb2 = new NumberBox();
//        NumberBox result = changeNum3(nb2);
        System.out.println("nb2.num : " + nb2.num);
//        System.out.println("result.num : "+ result.num);

        NumberBox nb3 = new NumberBox();
        NumberBox nb4 = changeNum4(nb3); //changeNum4()의 파라미터값에 nb3가 들어감
        //그 후 new NumberBox()주소값을 가진 nb3 객체생성
        //nb3.num = 30; //nb3가 가진 int num에 30 값 대입
        //return nb3; // 주소값 들고 리턴
        System.out.println("nb3.num : "+nb3.num);
        System.out.println("nb4.num : "+nb4.num);
    }

    static void changeNum(int num) {
        num = 20;
    }
    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }
    static void changeNum3(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 30;
//        return nb2;
    }

    static NumberBox changeNum4(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 30;
        return nb2;
    }
}
