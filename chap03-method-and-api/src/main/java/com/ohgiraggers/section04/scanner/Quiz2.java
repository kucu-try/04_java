package main.java.com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class Quiz2 {

    //문제2
    /*
     * 식당에서 스파게티, 햄버거, 스테이를 주문하고 맛있게 먹었다.
     * 계산은 직접 가격을 입력하면 팁 20%가 추가된 최종 가격을 출력하는 기계에서 한다.
     * 음식의 가격을 직접 입력하면 최종 가격이 나오는 코드를 짜보자.
     * 1. Scanner 활용
     * 2. 계산식은 Quiz_Static 클래스에 입력하고  메인 클래스에 static 메소드를 호출하라
     * 출력화면은 "음식1 가격은?" -> "음식2 가격은?" -> "음식3 가격은?" -> "택스 포함 최종 가격은 —원 입니다."
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz2 quiz2 = new Quiz2();


        System.out.println("음식1 가격은? :" );
        int food1 = sc.nextInt();

        System.out.println("음식2 가격은? :");
        int food2 = sc.nextInt();

        System.out.println("음식3 가격은? :");
        int food3 =sc.nextInt();

        double total = quiz2.price(food1,food2,food3);
        System.out.println("택스 포함 최종 가격은"+total+"원 입니다.");

    }

    public double price(int food1, int food2, int food3){
        int foodPrice = food1 + food2 + food3;
        return foodPrice -(foodPrice*0.2);
    }

}
