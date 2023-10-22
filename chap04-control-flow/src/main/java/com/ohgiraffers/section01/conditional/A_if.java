package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public String testSimpleIfStatement(int num1) {
        /*
         * (if문 표현식)
         * if(조건){
         *   조건이 참일 경우 실행할 내용
         * }
         *
         *
         * 조건식이 : 참 혹은 거짓이 나오는 연산식을 조건식이라고 한다.
         * if뭉은 조건식의 결과 값이 참이면 {} 안에 있는 코드를 실행하고
         * 조건식의 결과 값이 거짓이면 {} 안의 내용을 무시한다.
         *
         * 정수를 한 개 입력받고 그 수가 짝수인지 아닌지 검사하는 프로그램을 만들어보자
         * */


        if (num1 % 2 == 0) {
            return "짝수입니다.";
        } else {
            return "홀수";
        }

    }
}
