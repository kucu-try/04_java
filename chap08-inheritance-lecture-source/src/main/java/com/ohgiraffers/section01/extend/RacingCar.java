package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car{
    public RacingCar(){
        System.out.println("racingCar 클래스의 기본 생성자를 호출");
    }


    @Override
    public void run(){
        System.out.println("레이싱카가 전손력으로 질주합니다.");
    }

    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적이 없습니다.");
    }

    @Override
    public void stop(){
        System.out.println("멈춥니다 레이");
    }
}
