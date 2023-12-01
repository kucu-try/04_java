package main.java.com.ohgiraffers.section01;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = "";
        String d = "";

        for (int i = 2; i >= 0; i--) {
            c += a.charAt(i);
            d += b.charAt(i);
        }

        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);

        if (e>f){
            System.out.println(e);
        } else if (e<f) {
            System.out.println(f);
        }
    }
}
