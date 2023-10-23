package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Applicaition05 {
    public static void main(String[] args) {
        /*
        * 랜덤한 카드를 한 장 뽑아서 출력해보자
        * */

        String[] shapes = {"SPADE" , "CLOVER", "HEART" , "DIAMOND"};
        String[] charNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        Random random = new Random();
        int num10 = random.nextInt(shapes.length);
        int num20 = random.nextInt(charNumber.length);

//        int shapeNum = (int) (Math.random()*shapes.length);
//        int charNum = (int) (Math.random()*charNumber.length);

        System.out.println("고르신 카드는 " +shapes[num10] +"  "+ charNumber[num20] +"입니다");

    }
}
