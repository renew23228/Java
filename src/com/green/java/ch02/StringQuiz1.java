package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.jpg"; //파일명과 확장자를 알아내서 파일이름은 fileNm 확장자는 ext로 저장
        String fileNm, ext;

        int dotIdx = fullFileNm.lastIndexOf(".");


//        int dotIdx = fullFileNm.indexOf("."); // .의 인덱스값 구하기
        System.out.println(dotIdx);

        ext = fullFileNm.substring(dotIdx); // .의 인덱스값 이용해서 .포함 이후 문자열 자르기
        System.out.println("ext : "+ext);
        // ext = fullFileNm.substring(dotIdx+1); // . 빼고 확장자명만 자르기

        fileNm = fullFileNm.substring(0,dotIdx);
        System.out.println("fileNm : "+fileNm);

    }
}
