package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();

        int[] b = new int[a];
        int cnt = 0;

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int c = sc.nextInt();


        for (int i = 0; i < b.length; i++) {
            if (b[i] == c) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
