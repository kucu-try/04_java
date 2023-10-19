package main.java.com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class Quiz5 {
    //문제5
    // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,
    // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
    // 5000원을 이상이면 "검소한 식비입니다.",
    // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.
    // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Quiz5 quiz5 = new Quiz5();

        System.out.println("일 식비가 얼마냐 : ");
        long priceDay = sc.nextInt();
        String total = quiz5.status1(priceDay);

        System.out.println(total);

    }
    public String status1(long a){
        if(a>=10000){
            return "과소비된 식비입니다";
        }else if(a >= 5000 && a < 10000){
            return "검소한 식비입니다.";
        }else {
            return "굶는 중 입니다.";
        }
    }
}
