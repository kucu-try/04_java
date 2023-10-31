package main.java.com.ohgiraffers.section02.uses2;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
       loop: while(true){
            System.out.println("1. 몬스터 등록");
            System.out.println("2. 몬스터 목록 ");
            System.out.println("3. 상태창 종료");

            int skill = sc.nextInt();

            switch(skill){
                case 1 : manager.regist(); break;
                case 2 : manager.show(); break;
                case 3 :
                    System.out.println("스킬창 종료");
                    break loop;
                default:
                    System.out.println("다시 눌러"); break ;
            }
        }
    }
}
