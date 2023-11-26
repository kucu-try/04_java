package main.java.com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 1;

        for (int i = 0; i < 5; i++) {
            while (no < 5) {
                no++;
                count++;
            }
        }

        System.out.println(count);
    }
}
