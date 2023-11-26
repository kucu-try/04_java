package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        while (again){
            int n = sc.nextInt();
            if (n < 1 || n > 10){

            }else {
                for (int i = 1; i < 10; i++) {
                    System.out.println(n + " * " + i + " = " + n*i);
                }
                again = false;
            }
        }
    }
}
