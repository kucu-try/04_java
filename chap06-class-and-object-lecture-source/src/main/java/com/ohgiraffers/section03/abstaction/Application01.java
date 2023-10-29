package main.java.com.ohgiraffers.section03.abstaction;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){
        /*사용자-운전자-자동차
        * 운전자-시동걸기, 엑셀 밟기, 브레이크 밟기, 시동끄기
        * 자동차-시동, 전진, 멈춤, 시동Off
        * */

        CarRacer01 c1 = new CarRacer01();
        Scanner sc = new Scanner(System.in);

        loop :while (true) {
            System.out.println("1. 시동");
            System.out.println("2. 엑셀");
            System.out.println("3. 브레이크");
            System.out.println("4. 시동 끄기");
            System.out.println("5. 종료");

            int command = sc.nextInt();

            switch (command) {
                case 1 : c1.start(); break;
                case 2 : c1.go(); break;
                case 3 : c1.break1(); break;
                case 4 : c1.off(); break;
                case 5 :
                    System.out.println("종료합니다"); break loop;
                default :
                    System.out.println("제대로 입력 바람");
            }
        }

    }
}
