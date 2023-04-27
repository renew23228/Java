package com.green.java.ch08;public class TryCatchStudy3 {
    public static void main(String[] args) {
        int r = div(10, 3);
        System.out.println("r : "+r);
    }

    public static int div(int n1, int n2) {
        int r = 0;
        try {
            r = n1/n2;
            if(r%2 == 0) { return 100; } //r이 짝수면 파이널리 실행하고 return 100값 가지고 돌아감
        } catch(ArithmeticException | NumberFormatException e2) {
          //multi catch block

        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            System.out.println("파이널리");
        }
        return r;
    }
}
