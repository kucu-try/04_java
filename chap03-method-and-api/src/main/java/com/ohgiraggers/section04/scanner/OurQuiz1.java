package main.java.com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class OurQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("첫 번 째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("연산할 기호를 쓰세요 : ");

        String op = sc.next();


        System.out.println("두 번 째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        long result = OurQuiz1.add(num1, op, num2);

        System.out.println("결과는 " + result + "입니다");
    }

    public static long add(long a, String c, long b) {
        if (c.equals("+") ) {
            return a + b;
        } else if (c .equals( "-")) {
            return a - b;
        } else if (c .equals( "*") ){
            return a * b;
        } else if (c .equals( "/")) {
            return a / b;
        } else if (c .equals( "%")) {
            return a % b;

        }else{
            return 0;
        }


    }
}