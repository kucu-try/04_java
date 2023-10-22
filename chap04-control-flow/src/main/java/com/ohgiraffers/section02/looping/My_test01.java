package main.java.com.ohgiraffers.section02.looping;

import java.util.Random;

public class My_test01 {
    public static void main(String[] args) {
//        짱구가 로또기계를 조작할 수 있는 초능력을 얻었다.
//        짱구는 로또의 당첨 번호 5개를 [1, 4, 6, 2, 8]로 만들려고 한다.
//        로또 기계에서 나오는 공의 번호들이 위의 번호들과 같게 만들자.
//         로또 번호는 1번부터 10번까지 있다.
//
//        숫자 10까지 난수가 발생할 수 있게 램덤을 생성
        //do while을 사용할 것

        Random random = new Random();
        int num1 ;



           do{
               num1 = random.nextInt(9)+1;

                if(num1 == 1){
                    System.out.println("1번 째 숫자는 "+num1+"입니다.");
                }
            }while (num1 != 1);


            do{
                num1 = random.nextInt(9)+1;

                if(num1 == 4){
                    System.out.println("2번 째 숫자는 "+num1+"입니다.");
                }
            }while (num1 != 4);


        do{
            num1 = random.nextInt(9)+1;

            if(num1 == 6){
                System.out.println("3번 째 숫자는 "+num1+"입니다.");
            }
        }while (num1 != 6);


        do{
            num1 = random.nextInt(9)+1;

            if(num1 == 2){
                System.out.println("4번 째 숫자는 "+num1+"입니다.");
            }
        }while (num1 != 2);


        do{
            num1 = random.nextInt(9)+1;

            if(num1 == 8){
                System.out.println("5번 째 숫자는 "+num1+"입니다.");
            }
        }while (num1 != 8);




    }



}
