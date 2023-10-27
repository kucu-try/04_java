package main.java.com.ohgiraffers.section08.test2;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){
        //회원 3명의 이름을 받고 3명의 정보를 출력하라.
        //배열을 통해서 만들고
        //override를 통해 출력해라

        Member2[] mem = new Member2[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "번 회원 정보 입력 : ");
            String info = sc.nextLine();
            mem[i] = new Member2(info);
        }

        for(Member2 member3 : mem){
            if(member3 != null){
                System.out.println(member3);
            }
        }
    }
}
