package main.java.com.ohgiraggers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /* 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        *
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        *
        *  두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        *
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        * */

        Application7 plus = new Application7();
       int num10 = 5;
       int num20 = 10;

        System.out.println (plus.method1(num10, num20));
        System.out.println (plus.method2(num10, num20));
        System.out.println (plus.method3(num10, num20));
        System.out.println (plus.method4(num10, num20));
    }
    public int method1(int num1 , int num2 ){
        return num1 + num2;
    }
    public int method2(int num1 , int num2 ){
        return num1 - num2;
    }
    public int method3(int num1 , int num2 ){
        return num1 * num2;
    }
    public int method4(int num1 , int num2 ){
        return num1 / num2;
    }
}
