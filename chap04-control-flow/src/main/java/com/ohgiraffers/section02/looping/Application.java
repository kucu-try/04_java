package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        A_for a = new A_for();
        Scanner scanner = new Scanner(System.in);
        System.out.println("n단을 출력하는 프로그램입니다 n 입력:");
        int num = scanner.nextInt();
        a.gugudan(num);

//        B_while b = new B_while();
//        Scanner sc = new Scanner(System.in);

//        System.out.println("n단의 수를 입력해주세요.: ");
//        int num1 = sc.nextInt();


//        b.gugudan(num1);
    }
}
