package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application02 {

    //체력과 이름을 몬스터3마리에게 부여하기
    //몬스터라는 클래스에 이름과 체력을 부여하고 출력하는 생성자 만들

    public static void main(String[] args){
        Monster1 m1 = new Monster1();
        m1.setHp(100);
        m1.setName("슈퍼맨");
        System.out.println(m1.getInfo());
    }
}
