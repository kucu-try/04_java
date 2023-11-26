package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        while (c){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((a < 0 || a >23) || (b < 0 || b > 59)){
                continue;
            }

            if (b >= 45){
                System.out.println(a);
                System.out.println(b-45);
            } else if (b < 45) {
                if (a == 0) {
                    System.out.println(a+23);
                    System.out.println(60+(b-45));
                } else {
                    System.out.println(a-1);
                    System.out.println(60+(b-45));
                }
            }
            c=false;

        }


    }
}
