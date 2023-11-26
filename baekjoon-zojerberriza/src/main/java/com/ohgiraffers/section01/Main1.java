package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean again = true;
        while (again){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a < 1 || a > 6) || (b < 1 || b > 6) || (c < 1 || c > 6)){
                System.out.println("다시");
            } else  {
                if (a == b && b == c){
                    System.out.println(10000 + a * 1000);
                } else if (a == b && a != c) {
                    System.out.println(1000 + a * 100);
                } else if (a == c && b != c) {
                    System.out.println(1000 + c * 100);
                }else if (b == c && a != c) {
                    System.out.println(1000 + b * 100);
                } else if (a != b && b != c) {
                    if (a > b && a > c){
                        System.out.println(a * 100);
                    } else if (b > a && b > c) {
                        System.out.println(b * 100);
                    } else if (c > a && c > b) {
                        System.out.println(c * 100);
                    }
                }
                again = false;
            }
        }



    }
}
