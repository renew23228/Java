package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2); //nb1 nb2의 주소값이 다르기 때문에. 래퍼런스변수끼리의 == 비교는 주소값 비교
        System.out.println("r1 : "+r1);

        boolean r2 = nb1.equals(nb2);
        System.out.println("r2 : "+r2);


    }

}

class NumberBox {
    private int num;
    NumberBox(int num) {
        this.num = num;
    }
    int getNum() {
        return num;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof NumberBox)) { //들어온 값이 NumberBox타입이 아닐경우 false리턴
            return false;
        }
        NumberBox nb = (NumberBox)obj;
        return this.num == nb.getNum();
//        obj.getNum();
// 안되는 이유 Object은 getNum메서드를 모름. Object객체는 getNum메서드 모름

    }


}


