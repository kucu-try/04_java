package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSipmeWhileStatement(){
        /*while 문 표현식
        *
        * while(조건식){
        *
        * }
        * */
        //continue 건너뛴다 while문에서 사용함
        Scanner scanner =new Scanner(System.in);
//        String value = scanner.nextLine();
//
//        int i = 0;
//        while (i <= value.length()){
//            System.out.println(i);
//            i++;
//        }

        /*do{
        *
        * }while(조건식)
        * */
//        boolean isTrue =false;
//        do{
//            System.out.println("메뚜기 월드 게임");
//            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요.");
//            isTrue =scanner.nextBoolean();
//        }while (isTrue);
   }

   // n단 함수를 do while을 이용해서 만들어보자
    //함수에 어플리케이션에 있는 수를 받아온다.
    public void gugudan(int num){
        int number1 = 0;
        boolean isTrue =false;
        //do while문이 종료하게 만든다.
        do{
            // num 의 숫자가 * 9 이상의 숫자가 될때 까지 반복한다.

            for(int i = 1 ; i < 10; i++){
                for(int a = 1; a<10; a++){
                    i = i * a;
                    System.out.println(i);
                }
                //num과 계속 1씩 더해지는 i의 곱한 값을 저장할 변수를 만든다.
            }
        }while(isTrue);
    }







}
