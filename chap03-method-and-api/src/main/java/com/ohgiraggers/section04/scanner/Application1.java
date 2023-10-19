package main.java.com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받는 기능이다
        *
        * 1-1 스캐너는 객체를 만들어서 사용한다
        *
        * */
        Scanner sc = new Scanner(System.in);

//        System.out.println("이름을 입력해 :" );
//        String name = sc.nextLine();
//        System.out.println("안녕하세요 " + name);
//
//        int age = sc.nextInt();
//        System.out.println("입력하신 나이는 " + age + "세가 맞나요?");
//
//        long lnum = sc.nextLong();
//        System.out.println("입력 long : " + lnum);
//
//        boolean isTrus = sc.nextBoolean();
//        if (isTrus) {
//
//            System.out.println("참이다");
//        }else{
//            System.out.println("거짓");
//        }
//        sc.nextLine();

        char charValue = sc.nextLine().charAt(5);
        System.out.println(charValue);

    }
}
