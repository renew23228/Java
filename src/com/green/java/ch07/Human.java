package com.green.java.ch07;

public class Human {
    private String name;
    private int age;
    private String job;

    public Human() {
        super();//생략해도 자동으로 입력됨. 부모(Object)의 기본생성자 호출
    }
    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() { //primative타입은 소문자시작
        return this.age;
    }

    public String getJob() {
        return this.job;
    }
    //setter는 무조건 void. 변수타입 맞추고, 파라미터의 변수명은 다른거해도되는데 대체로 맞추는편
//    public void setName(String name) {
//        this.name = name; // 파라미터 name과 멤버필드 name 이름이 같으니 this. 사용(this.은 주소값. 이라는 의미
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setJob(String job) {
//        this.job = job;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
