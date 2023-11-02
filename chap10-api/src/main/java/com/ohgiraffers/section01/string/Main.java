package main.java.com.ohgiraffers.section01.string;

import java.util.Scanner;

public class Main {


//거스름돈의 액수가 주어지면 리암이 줘야할
// 쿼터($0.25)의 개수, 다임($0.10)의 개수, 니켈($0.05)의 개수, 페니($0.01)의 개수를 구하는 프로그램.
// 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
// 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다.
// C의 단위는 센트이다.

    //입력 값에 따라 프로그램 실행 반복
    //입력 값은 500이하여야 한다.
    //입력 값%쿼터가 0이라면 쿼터로 나눈 후 쿼터 카운트에 넣는다. 그 후 입력 값에 0을 반환
    //그 외라면 순서대로 한 후 쿼터를 제외하고 입력값에서 빼준후 변수에 저장 마지막에는 페니로 입력값에서 뺴준다.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for(int i = 0; i < t; i++){
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int c = sc.nextInt();
            while (c > 0){
                if(c >= 25){
                    count1 += c/25;
                    c %= 25;
                } else if (c >= 10) {
                    count2 += c/10;
                    c %= 10;
                } else if (c >= 5) {
                    count3 +=c/5;
                    c %= 5;
                } else {
                    count4 = c/1;
                    c %= 1;
                }
            }

            System.out.println(count1+" "+count2+" "+count3+" "+count4);
        }
    }
 }

