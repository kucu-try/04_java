package main.java.com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 사냥을 위해 달립니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부 짖습니다.");
    }

    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다.");
    }

}