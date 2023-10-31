package main.java.com.ohgiraffers.made01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Membership membership = new Membership();
        Man man = new Man();
        loop:while(true){
            System.out.println("1. 회원 가입 ");//회원을 가입하면 아이디가 생성된다.
            System.out.println("2. 로그인 후 게임 시작"); //로그인 조회 목록에 아이디가 없으면 회원가입을 해야한다.
            System.out.println("3. 게임 종료");
            int choice = sc.nextInt();
            switch(choice){
                case 1:  membership.join();
                    break ;
                case 2: membership.rogin();
                    break ;

                case 3:
                    System.out.println("게임을 종료합니다."); break loop;
            }
        }
    }
}
