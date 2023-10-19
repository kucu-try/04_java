package main.java.com.ohgiraggers.section04.scanner;

import java.util.Random;

public class Quiz4 {
    //문제4
    // A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
    // 답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
    // static 메소드를 활용해주세요

    public static void main(String[] args) {
        Random random = new Random();
        int numA = random.nextInt(100);
        int numB = random.nextInt(100);

        System.out.println("A의 값은 "+numA +" B의 값은 "+numB+"이므로 합은 ");
        int quiz4 = Quiz4.total(numA,numB);
        System.out.println(quiz4 +"입니다.");
    }

    public static int total(int a, int b){
        return a+b;
    }
}
