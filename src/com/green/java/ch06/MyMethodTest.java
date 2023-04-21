package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod(); //MyMethod를 객체화(인스턴스화)
        mm.sum(10, 20); //주소값. 으로 그 객체가 가진 메서드를 호출(call)할 수 있다
        mm.sum(10, 23);
        mm.sum(10, 44);
        mm.sum(10, 555); ////void메서드. void메서드는 앞에 타입 = 필요없이 그냥씀

        int result = mm.sum2(10, 245);
        System.out.println("result : "+result); //void메서드. void메서드는 앞에 타입 = 필요없이 그냥씀
        //System클래스의 out(이라는 PrintStream객체가 가지고 있는. static객체임)의 println()(메서드)를 호출
    }
}
