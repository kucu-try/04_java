package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] num = new int[6];
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개

        int[] a = new int[] {1,1,2,2,2,8};

        for (int i = 0; i < 6; i++) {
            num[i] =sc.nextInt();
        }



        for (int i = 0; i < a.length; i++) {
            if (a[i] == num[i]){
                System.out.print(a[i] -  a[i] +" ");
            } else {
                System.out.print(a[i] - num[i] + " ");
            }
        }

    }
}
