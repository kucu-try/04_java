package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String a = sc.nextLine();

        int b= sc.nextInt();

        System.out.println(a.charAt(b-1));
    }
}
