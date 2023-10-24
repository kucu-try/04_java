package main.java.com.ohgiraffers.section04.sort;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    // 문제 3
    // 포카드 만들기
    // 랜덤한 카드를 4장 뽑아서 포카드인지 아닌지 확인하고 포카드일 시 "포 카드!", 그외에는 "꽝!"이 나오도록 출력
    /*
     * 예시
     * 포 카드를 뽑는 운 게임
     * ===========================================
     * 게임 진행 여부 묻기
     * 당신이 뽑은 카드는
     * SPADE ACE, CLOVER KING, CLOVER 4, HEART 3
     * 꽝!*/
    public static void main(String[] args){
        String[][] card = {
            {"SPADE" , "CLOVER", "HEART" , "DIAMOND"},
            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"}
        };


        for(int i =0 ; i < 4; i++){
            int colorN =(int) (Math.random()*4);
            int numN = (int) (Math.random()*13);
            String cos =  card[0][colorN];
            String cos1 = card[1][numN];

            System.out.println(i+1 +"번 째 카드는 " + cos+ " " + " " + cos1);

        }


    }
}
