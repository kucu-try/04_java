package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSipmleSwtichStatement() {

        /*
         * [switch 문 표현식]
         * switch(비교한 변수){
         *   케이스 비교값 1 : 비교값 1과 일치하는 경우 실행할 구문, break;
         *   케이스 비교값 2 : 비교값 2과 일치하는 경우 실행할 구문, break;
         *   케이스 비교값 3 : 비교값 3과 일치하는 경우 실행할 구문, break;
         *   default : case 모두에 해당하지 않는 경우 실행할 구문; break;
         * }
         *
         *
         * 여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if -else-if 와 유사하다
         * 따라서 일부 호환이 가능하다
         * 하지만, switch 문으로 비교한 값은 정수ㅡ 문자ㅡ 문자열 형태의 값이다.
         * 실수와 논리는 비교할 수 없다.
         * 또한 정확하게 일치하는 경우에만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다
         * 케이스 절에는 변수를 사용하지 못한다.
         * 또한 문자열 비교는 jdk1.7 부터 가능하다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번 쨰 정수 입력: ");
        int first = sc.nextInt();

        System.out.println("두 번쨰 정수 입력: ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력(+,-,*,/,%)");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);

    }
//        public String testSwitchVendingMachine() {
//            /*
//             * 사용자가 선택한 음료와 가격을 문자열로 반환해주자
//             * 프로그램의 콘솔 출력은 반환받은 값을 main에서 출력할 것이다.
//             *
//             * 단 자판기는 switch 를 이용해서 만든다.
//             * */
//            System.out.println("=== OhGiraffers vending machine ===");
//            System.out.println("  사이다(500)   콜라(600)   환타(700)   바카스(1000)  핫식스(1500)  ");
//            System.out.println("==============================");
//            System.out.print("음료를 선택해주세요 : ");
//
//            Scanner sc = new Scanner(System.in);
//            String selectedDrink = sc.nextLine();
//
//            int price = 0;
//
//
//
//        }


    }



