package main.java.com.ohgiraffers.section08.initblok;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        //멤버1 클래스를 호출함
        Member1 m = new Member1("");
        //멤버1을 배열로 만듬. 배열 5개짜리.
        Member1[] members = new Member1[5];

        //입력을 받기위해 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        //회원의 순서와 회원의 정보를 자동적으로 넣기 위해 포문을 생성
        for (int i = 0; i < 5; i++) {
            System.out.println("회원 " + (i + 1) + "의 이름을 입력하세요:");
            //이름이기에 스트링 스캐너 입력
            String name = scanner.nextLine();
            //5개짜리 배열에 스캐너에서 입력한 각 이름들을 각 배열에 넣음
            members[i] = new Member1(name);
        }

        System.out.println("입력된 회원 정보:");
        //멤버1 클래스에서 변수명 멤버2에다가 위에서 받은 멤버스 배열의 값들을 넣음
        for (Member1 member2 : members) {
            //멤버2가 널이 아닐때까지(배열이 5를 넘어가면 널을 배출하니깐?)
            if (member2 != null) {

                System.out.println(member2);
            }
        }
    }



    }


