package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "long";
        while (a - 4 != 0){
            a -= 4;
            System.out.print(b + " ");
        }
        System.out.print("long int");
    }
}
