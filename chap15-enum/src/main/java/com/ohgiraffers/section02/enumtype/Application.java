package main.java.com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        /*
        * 열거형(enum) 을 이용한 상수 열거 패턴의 단점을 해결하기
        * */
        Subject sbj = Subject.JAVA;
        Subject sbj2 = Subject.HTML;

        if (sbj == sbj2){
            System.out.println("두  과목은 같은 과목입니다");
        }else {
            System.out.println("sbj : " + sbj);
            System.out.println("sbj2 : " + sbj2);
            System.out.println("는 다른 과목 입니다.");
        }
        //인스턴스의 탑입을 보장하기 때문에 == 으로 값을 비교하는 것이 가능하다.
        System.out.println(sbj == Subject.JAVA);

        Subject[] subject = Subject.values();
        for(Subject sb : subject){
            System.out.println(sb);
        }

    }
}
