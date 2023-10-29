package main.java.com.ohgiraffers.section03.abstaction;

public class Car01 {

    private boolean isOn;

    private int speed;

    public void start(){
        if(isOn){
            System.out.println("이미 시동이 걸려있다.");
        }else {
            this.isOn = true;
            System.out.println("시동이 걸렸다.");
        }
    }

    public void run(){
        if(isOn){
            if(speed ==0){
                System.out.println("출발");
            }
            speed +=10;
            System.out.println(speed + "km/h");
        }else {
            System.out.println("시동을 걸어라");
        }
    }

    public void break1(){
        if(isOn){
            if (this.speed > 0){
                while(this.speed >0){
                    speed -= 10;
                    System.out.println(speed + "km/h");
                }
            }
        }
    }

    public void isOff(){
        if(isOn){
            if(speed > 0){
                System.out.println("먼저 브레이크");
            }else{
                this.isOn = false;
                System.out.println("시동 off");
            }
        }else {
            System.out.println("이미 시동 off 이다.");
        }
    }
}
