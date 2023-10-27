package main.java.com.ohgiraffers.section01.init;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        /*
        * 객체 배열을 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환 값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우가 객체배열을 이용할 수 있다.
        * */



        Car car1 =new Car("페라리",300);
        Car car2 =new Car("람보르기니",350);
        Car car3 =new Car("롤스로이스",250);
        Car car4 =new Car("부가티",400);
        Car car5 =new Car("포터",500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();

        Car[] carArray = new Car[5];

        carArray[0] =new Car("페라리",300);
        carArray[1] =new Car("람보르기니",350);
        carArray[2] =new Car("롤스로이스",250);
        carArray[3] =new Car("부가티",400);
        carArray[4] =new Car("포터",500);

        System.out.println("===================");
        for (int i = 0; i< carArray.length; i++){
            carArray[i].driveMaxSpeed();
        }

        Car[] carArray2 = {
                new Car("페라리",300),
                new Car("티코",12000)
        };

        // 2의 배수의 인데스의 값만 변경하고자 하는 경우
        for (Car car: carArray2) {
            car.driveMaxSpeed();
        }

    }
}


    //과제
    //바둑판 만들기 (2차원 배열을 사용)
    //콘솔 프로그램
    //객체지향 적으로