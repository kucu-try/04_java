package main.java.com.ohgiraffers.section01.practice;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        List<String> operations = new ArrayList<>();
        int current = 1;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (current <= num) {
                stack.push(current);
                operations.add("+");
                current++;
            }

            if (stack.peek() == num) {
                stack.pop();
                operations.add("-");
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (String op : operations) {
            System.out.println(op);
        }
    }
}