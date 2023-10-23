package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요.
        * */

        // 1. 5명의 학생의 자바 정수를 입력 받는다.


        Scanner sc = new Scanner(System.in);
        int[] point = new int[5];
        int sum =0;
        for (int i = 1; i<point.length; i++){
            System.out.println("점수 입력");
            point[i] = sc.nextInt();
            System.out.println(i +" 번 째 자바 점수를 입력 :"  + point[i]);

            sum +=  point[i];
        }
        System.out.println("5명의 평균 : " + (double) (sum  / 5));



    }
}
