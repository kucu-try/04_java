package com.ohgiraffers.section05.logical;

public class Application {
    public static void main(String[] args) {

        /*논리 연산자
        * 논리값(true || false) 를 취급하는 연산자이다.
        *
        * 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결함 방향은 왼쪽에서 오른쪽이다.
        * 두개의 논리식을 판단하여 참과 거짓을 판단
        *   1-1. &&(논리 AND) : 두 개의 논리 식 모두 참일 경우 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
        *   1-2. ||(논리 or) : 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘다 거짓이면 거짓을 반환
        * 2. 논리 부정 연산자 : 피연산자가 하나의 단항 연산자로, 피연산자의 결항 방향은 왼쪽에서 오른쪽이다.
        *   1-1. !(논리 not) : 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환
        * */

        System.out.println("true와 true의 논리 and 연산: " +((true) && (true)));
        System.out.println("true와 false의 논리 and 연산 :" +(true && false));
        System.out.println("true와 false의 논리 or 연산: " +(true || false));
        System.out.println("false와 true의 논리 or 연산: " +(false || true));
        System.out.println("true의 논리 not 연산 : " +(!true));



        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인: "+ ((a < b) && (c > d)));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + ((a < b) && (c > d)));
        System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + ((a>b)&&(c<d)));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a>b)&&(c>d)));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + ((a < b) || (c < d)));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + ((a < b) || (c > d)));
        System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + ((a > b) || (c < d)));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + ((a > b) || (c > d)));

    }
}
