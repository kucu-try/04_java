package main.java.com.ohgiraffers.test01;

import main.java.com.ohgiraffers.section01.conditional.D_switch;

import java.util.Scanner;

public class A_team {
    public static void main(String[] args){
        // 음료 계산
        // 자판기를 만들어보자.
        // 자판기가 파는 음료는 사이다(500)   콜라(600)   환타(700)   바카스(1000)
        // 잘못된 음료수를 선택했을 때는 다시 받아야 한다
        // 예시)
        // 계산을 입력하면 총 금액을 출력해야 한다.
        //음료를 선택해주세요 : 사이다
        //사이다를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //n
        //음료를 더 선택해주세요.
        //몰라
        //잘못된 음료입니다. 다시 선택해주세요:
        //콜라
        //콜라를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //y
        //총금액은 1100입니다.


        A_team ateam = new A_team();
//        ateam.japangi();


        //구구단

        ateam.gugudan1();




    }
    public void japangi(){
        int price =0;
        int total =0;
        Scanner sc = new Scanner(System.in);
        for(;;) {
            for (;;){
                System.out.println("사이다(500)   콜라(600)   환타(700)   바카스(1000)");
                System.out.println("음료를 선택해주세요. :");
                String choice = sc.next();

                if (choice.equals("사이다")) {
                    System.out.println("사이다를 선택하셨습니다.");
                    price = 500;
                    break;
                } else if (choice.equals("콜라")) {
                    System.out.println("콜라를 선택하셨습니다.");
                    price = 600;
                    break;
                } else if (choice.equals("환타")) {
                    System.out.println("환타를 선택하셨습니다.");
                    price = 700;
                    break;
                } else if (choice.equals("바카스")) {
                    System.out.println("바카스를 선택하셨습니다.");
                    price = 1000;
                    break;
                } else {
                    System.out.println("잘 못 선택했습니다");

                }

            }
            total += price;
            System.out.println("계산하시겠습니까?(y/n)");
            char answer1 = sc.next().charAt(0);
            if(answer1 =='y') {
                System.out.println("총 금액 : " + total);
                break;
            }
            for (;;){

                if (answer1 =='n') {
                    System.out.println("추가 음료 구매.");
                    break;
                } else {
                    System.out.println("잘못입력");
                    System.out.println("계산하시겠습니까?(y/n)");
                    answer1 = sc.next().charAt(0);
                }
            }
        }
    }

    /*-----------------------------------------------------------------------------------*/

    public void gugudan1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단할 n단 입력: ");
        int num1 = sc.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(num1 + " X " + i + " = " + num1 * i);
        }

    }









}
