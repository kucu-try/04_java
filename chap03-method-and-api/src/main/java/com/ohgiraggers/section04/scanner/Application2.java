package main.java.com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("값을 입력해: ");
//        String greeting = sc.nextLine();
//        System.out.println(greeting);

        System.out.println("두번 째 값 입력해:");
        int greeting = sc.nextInt();
        System.out.println(greeting);

        System.out.println(greeting+3);
    }
}
