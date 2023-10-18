package com.ohgiraffers.section06.ternary;

public class Application00 {
    public static void main(String[] args) {

        //삼항연산자를 이용해 한 강아지의 아이큐가 60보다 낮으면 똥개 . 60보다 높으면 천재견을 출력해라.
        //강아지 '백구'의 아이큐는 200이다.
        //  보여지는 출력은 다음과 같다
        // "백구의 아이큐는 200 이므로 (똥개/천재견) 이다.

        int dog = 200;
        String result = (dog < 60) ? "똥개.":"천재견.";
        System.out.println("백구의 아이큐는 " +(dog)+" 이므로 "+result+"이다");


        System.out.println("================================================================");
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 35만원 , 와인 : 30만원 , 고량주 : 40만원 이다.
        // 마트의 주당 평균 총 매출이 140 만원일때
        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),
        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.
        // 다음과 같은 양식을 가진다5
        // A마트 이번 주 주류의 평균 실적은 ()만원이고, 세금은 ()만원을 냈으며, 세금을 제외한 수입은 ()만원이다.
        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다.
        int soju = 45;
        int beer = 35;
        int wine = 30;
        int supersoju = 50;
        int plus = (soju + beer + wine + supersoju);
        double sum1 = plus/4;
        double sum = (plus-(plus/4));
        double highlow = sum;
        String result10 = (sum < 140) ? "낮다.": (sum > 140) ? "높다" : "낮다";

        System.out.println("A마트 이번 주 평균 실적은 " +(sum1)+"만원이고, 세금은 " + ((plus*0.1)) +"만원을 냈으며. 세금을 제외한 수입은 "+(plus-(plus*0.1))+"만원이다");
        System.out.println("이번 주 총 매출은 평균 총 매출보다 " + result10);

        System.out.println("================================================================");
        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.
        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.
        // 조건
        // 삼항 연산자를 사용하시오
        int goodBoy = 113;
        int badBoy = 127;

        String result100 =  (goodBoy >= 120)? "가능합니다":"불가능하다";
        String result1000 =  (badBoy >= 120)? "가능합니다":"불가능하다";
        System.out.println("키가 " +goodBoy+"cm 이므로 탑승 "+result100);
        System.out.println("키가 " +badBoy+"cm 이므로 탑승 "+result1000);
        System.out.println("================================================================");
        System.out.println("================================================================");

//        1. 한 축구 구단의 직원 수는 약 1892명 이다.
//        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수를 15% 줄여야 한다.
//        17위 이상을 기록하면 구단의 직원수는 15% 증가한다. (삼항연산자로 해보기)
        int soccermans = 1892;
        int team1 = 17;
        int result200 = (team1 >= 18)? (int)(soccermans-(soccermans*0.15)) : (int)(soccermans+(soccermans*0.15));
        System.out.println("팀은 "+team1+"위를 기록하여 직원 수가 "+soccermans+" 에서 "+result200+"명이 되었다.");
        System.out.println("================================================================");
//          2. 영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다
//            평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력하라.
        int stu1 =90;
        int stu2 =95;
        int stu3 =81;
        int test4 =(stu1+stu2+stu3)/3;
        System.out.println(test4>=90 && test4<=100);
        System.out.println("================================================================");
//            3. 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라.
        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String  result44 = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";

        System.out.println(result44);
        System.out.println("================================================================");
//            4. 시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력
        int a =50;
        int b =40;
        int c =60;
        int sum23=(a+b+c)/3;
        String test33 = (sum23 < 40) ? "불합격" : "합격";
        System.out.println(test33);
        System.out.println("================================================================");
        System.out.println("================================================================");

//        1. ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것

        char ch1 = 'X';
        char ch2 = 'Z';
        String ch3 = (ch1 == ch2) ? "참" : "거짓";
        System.out.println(ch3);
        System.out.println("================================================================");
//        2. 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다

        int myAge = 28;
        String iCanDrink = (myAge < 20) ? "미성년자" : "성인";
        System.out.println("나는 "+iCanDrink+"이다");
        System.out.println("================================================================");
//        3.길동이의 첫달 월급은 100만원이다
//        짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
//        길동이 연봉은?

        int swordMaster = 100;
        double oddNum = swordMaster*0.1;
        double evenNum = swordMaster*0.15;
        int yearM = 0;

        for(int i = 1; i < 13; i++ ){
            int money = (i % 2 == 0) ? swordMaster + (int)evenNum : swordMaster + (int)oddNum;
            yearM += money;
        };
        System.out.println("길동이의 연봉은 " +yearM +" 만원 입니다.");
    }
}

