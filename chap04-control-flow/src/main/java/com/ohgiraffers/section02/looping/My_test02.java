package main.java.com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class My_test02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.println("원하시는 첫 번째 공의 번호를 말하세요. : ");
        sc.nextInt();

        while(true){
            //우선 첫 번 쨰 원하는 숫자가 나올 때까지 랜덤 함수를 돌린다.
            //첫 번쨰 원하는 숫자가 나오면 [i(1) + "번 째 숫자는 " + num1 + "입니다.]를 출력한 후 두 번째로 넘어간다.
            // 두 번 쨰 원하는 숫자가 나올 때까지 랜덤 함수를 돌린다.
            // 두 번째 원하는 숫자가 나오면 [i(2) + "번 째 숫자는 " + num1 + "입니다.]를 출력한다.
            // 다섯 번째까지 원하는 숫자를 랜덤으로 돌려 나오게 한 후 위와 같이 출력한다.
            for (int i = 1; i < 6; i++) {
                num1 = random.nextInt(9) + 1;
                if(num1 == 1){
                    System.out.println(i + "번 째 숫자는 " + num1 + "입니다.");
                }

            }
        }

    }
}
