package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 논리식의 && 논리식 : 앞의 결과가 false 이면 뒤의 연산 실행 안함
        * 논리식의 || 논리식 : 앞의 결과가 참이면 뒤의 연산을 실행하지 않음
        * */
        int num1 =10;
        int result = (false && ++num1>0)? num1:20;
        System.out.println(result);

        /*조건식 등 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
        뒤의 조건을 확인할 필요럾이 true를 반환한다
        * */

        int num2 =20;
        int result2 = (true || ++num2 > 0) ? num2 : 30;
        System.out.println(result2);
        int result3 = (false || num2 < 0) ? num1 : 30;
        System.out.println(result3);
    }
}
