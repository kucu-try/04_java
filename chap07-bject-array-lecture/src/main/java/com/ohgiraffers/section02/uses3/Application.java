package main.java.com.ohgiraffers.section02.uses3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

       loop:while(true){
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            int no = sc.nextInt();

            switch(no){
                case 1: memberService.signUpMembers(); break ;
                case 2: memberService.showAllMembers(); break;
                case 3:
                    System.out.println("종료"); break loop;
            }
        }
    }
}
