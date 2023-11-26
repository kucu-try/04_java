package main.java.com.ohgiraffers.section01.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        List<String> operations = new ArrayList<>();
        int count =1;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (count <= num){
                stack.push(count);
            }
        }
    }
}
