package main.java.com.ohgiraffers.section03.abstaction;

public class CarRacer01 {

    private final Car01 car01 = new Car01();

    public void start(){
        car01.start();
    }

    public void go(){
        car01.run();
    }

    public void break1(){
        car01.break1();
    }

    public void off(){
        car01.isOff();
    }
}
