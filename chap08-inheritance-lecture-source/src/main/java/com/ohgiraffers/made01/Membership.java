package main.java.com.ohgiraffers.made01;

import java.util.Scanner;

public class Membership {

  private static String[] id;
  private static String[] pwd;

  private static int count = 0;

  static {
      id = new String[3];
      pwd =new String[3];
  }

    public static void join(){
        Scanner sc =new Scanner(System.in);
        System.out.println("아이디 생성:");
        String id1 = sc.nextLine();
        System.out.println("비밀번호 생성:");
        String pwd1 = sc.nextLine();
        id[count] = id1;
        pwd[count] =pwd1;
        count++;
    }

    public void rogin(){
        Scanner sc =new Scanner(System.in);
        Man man = new Man();
        loop:while (true){
            System.out.println("아이디 입력: ");
            String no1 = sc.nextLine();
            System.out.println("비밀번호 입력: ");
            String no2 = sc.nextLine();
            for (int i=0; i< count; i++){
                if(no1.equals(id[i]) && no2.equals(pwd[i])){
                    System.out.println("로그인 성공!");
                    System.out.println("-------------------------------");
                    System.out.println("게임을 시작합니다");
                    System.out.println();
                    man.ranNum();
                    break  loop;
                }
            }
            System.out.println("아이디 또는 비번이 틀렸습니다. 다시 입력 바람.");break loop;
        }



    }
}
