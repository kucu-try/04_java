package main.java.com.ohgiraffers.test01;

import java.util.Random;
import java.util.Scanner;

public class C_team {
    public static void main(String[] args) {
        /* 3개의 주사위를 던져서 상금을 받는 게임 프로그램을 제작한다.

        3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
        3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
        모두 다른 숫자의 눈이라면 “꽝”을 출력한다.

        게임 프로그램을 작성하시오.

        1. if 조건문을 1회 이상 사용해야 한다.
        2. 입력한 내용이 ‘굴리기’가 아니라면 다음과 같이 실행한다.
        System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
        3. 6면체 주사위 코드는 다음과 같다.
        return (int) (Math.random() * 6) + 1;

        [출력 내용 예시 (주사위 숫자가 모두 다른 경우)]
        ===주사위 게임을 시작합니다.===
        첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        첫 번째 주사위: 3
        두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        두 번째 주사위: 4
        세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
        굴리기(사용자 입력)
        세 번째 주사위: 2
        꽝!     */
        C_team cteam = new C_team();
        cteam.dice();

        //별 찍기

//        cteam.star();
    }


//    public void star(){
//        Scanner sc= new Scanner(System.in);
//        String star2 = "*";
//
//        for(;;){
//            System.out.println("몇 줄 찍을꺼니 (1~50줄 까지만): ");
//            int star1 = sc.nextInt();
//            if(star1 < 1 || star1 > 50){
//                System.out.println("질문 좀 똑바로 봐.");
//            }else {
//                for(int i = 1 ; i <= star1; i++){
//                    System.out.println(star2);
//                    star2 += "*";
//                }
//                break;
//            }
//        }
//    }


    public void dice(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" 1번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String run1 = sc.nextLine();
        int dice1 = random.nextInt(5)+1;
            if(run1.equals("ㄱ")){

                System.out.println( "1번째 주사위 : " + dice1);

            }else {
                System.out.println("프로그램을 종료합니다.");
            }

        System.out.println(" 2번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String run2 = sc.nextLine();
        int dice2 = random.nextInt(5)+1;
        if(run2.equals("ㄱ")){
            System.out.println( "2번째 주사위 : " + dice2);

        }else {
            System.out.println("프로그램을 종료합니다.");
        }

        System.out.println(" 3번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String run3 = sc.nextLine();
        int dice3 = random.nextInt(5)+1;
        if(run3.equals("ㄱ")){

            System.out.println( "3번째 주사위 : " + dice3);

        }else {
            System.out.println("프로그램을 종료합니다.");
        }
//        3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
//        3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
//        모두 다른 숫자의 눈이라면 “꽝”을 출력한다.
        if(dice1 == dice2 && dice1 ==dice3){
            System.out.println(20000+dice1*2000 + "상금!!1");
        } else if (dice1 == dice2 || dice1 ==dice3) {
            System.out.println(1500 + dice1 *100 +"상금!!2");
        } else if (dice3 == dice2) {
            System.out.println(1500 + dice1 *100 +"상금!!2");
        }else {
            System.out.println("꽝!");
        }

    }
}
