package com.ohgiraffers.section06;

public class Application00 {
    public static void main(String[] args) {

        //삼항연산자를 이용해 한 강아지의 아이큐가 60보다 낮으면 똥개 . 60보다 높으면 천재견을 출력해라.
        //강아지 '백구'의 아이큐는 200이다.
        //  보여지는 출력은 다음과 같다
        // "백구의 아이큐는 200 이므로 (똥개/천재견) 이다.

        int dog = 200;
        String result = (dog < 60) ? "똥개.":"천재견.";
        System.out.println("백구의 아이큐는 " +(dog)+" 이므로 "+result+"이다");


        //================================================================
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

        //==============================================================

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
        //========================================================================
            //김진규님 팀 1번
        int soccermans = 1892;
        int team1 = 17;
        int result200 = (team1 >= 18)? (int)(soccermans-(soccermans*0.15)) : (int)(soccermans+(soccermans*0.15));
        System.out.println("팀은 "+team1+"위를 기록하여 직원 수가 "+soccermans+" 에서 "+result200+"명이 되었다.");
            //김진규님 팀 2번
        int stu1 =90;
        int stu2 =95;
        int stu3 =81;
        int test4 =(stu1+stu2+stu3)/3;
        System.out.println(test4>=90 && test4<=100);
            //김진규님 팀 3번
        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String  result44 = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";

        System.out.println(result44);
        //4번
        int a =50;
        int b =40;
        int c =60;
        int sum23=(a+b+c)/3;
        String test33 = (sum23 < 40) ? "불합격" : "합격";
        System.out.println(test33);
    }
}

