package main.java.com.ohgiraffers.test01;

import java.util.Random;
import java.util.Scanner;

public class B_team {
    public static void main(String[] args){
        // up down 게임 만들기
        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
        // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
        // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
        // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

        // 조건문과 반복문을 사용하세요.
        B_team bteam = new B_team();

       // bteam.updown();

        //--------------------------------------------
        // 백준 : 조건문 5단계 알람시계

        bteam.alram1();
    }

    public void alram1(){
        Scanner sc = new Scanner(System.in);
        int plus45 = 45;
        for(;;){
            System.out.println("알람 시간을 설정해주세요. 시간 0~23Hour :");
            int time1 = sc.nextInt();
            if(time1 < 0 || time1 > 23 ){
                System.out.println("다시 '시' 부분을 설정해주세요. ");
            }else {
                for(;;){
                    System.out.println("몇 분 ?  0~59Min :");
                    int time2 = sc.nextInt();
                    if(time2 < 0 || time2 > 59 ){
                        System.out.println("다시 '분' 부분을 설정해주세요. ");
                    }else {
                        System.out.println("알람을 설정한 시간은 "+ time1 +"시"+ time2 +"분 입니다.");
                        System.out.println("설정한 알람에서 45분 일찍 알람으로 설정합니다");
                        if((time2 - plus45) < 0){
                            int earlyHour = time1 - 1 ;
                            int earlyMin = ((time2 - plus45) + 60);
                            System.out.println("45분 일찍 설정한 시간은 "+ earlyHour +"시"+ earlyMin +"분 입니다.");
                        }else {
                            System.out.println("알람을 설정한 시간은 "+ time1 +"시"+ (time2-45) +"분 입니다.");
                        }
                        break;
                    }
                }
                break;
            }
        }



    }



    public void updown(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int updown1 = random.nextInt(99)+1;

        for (int i = 5; i != 0; i--){

            System.out.println("1부터 100 사이에서 제가 생각한 숫자를 맞춰보세요. updown 기회는 "+ i +"번입니다.");
            int num1 = sc.nextInt();

            if(updown1 > num1){
                System.out.println("up 입니다.");
            } else if (updown1 < num1) {
                System.out.println("down 입니다.");
            } else {
                System.out.println(" 정답 !");
                break;
            }
        }
        System.out.println("게임 끝!");
    }


}
