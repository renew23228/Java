package com.green.java.ch02;
//문자열 더하기는 메모리 많이 쓰니 문자열 더하기 많이할 때 쓰는거
public class VariableString3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("하하");
        sb.append("후후");

        System.out.println(sb.toString());
    }
}
