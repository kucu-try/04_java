package main.java.com.ohgiraggers.section04.scanner;

public class Quiz1_1 {

    public String isAdult(int age) {
        return  (age <= 14) ? "14세 미만은 회원가입할 수 없습니다." : yesAdult("김과장");
    }

    public String yesAdult(String personName) {
        return  personName.equals("김과장") ? "vip" : personName.equals("박부장") ? "기존" : "신규";
    }
}
