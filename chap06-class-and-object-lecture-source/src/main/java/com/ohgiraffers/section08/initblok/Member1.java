package main.java.com.ohgiraffers.section08.initblok;

public class Member1 {
    //멤버1이라는 클래스 안에 네임 필드를 생성함
    private String name;


    //멤버1 함수가 멤버1클래스 매개변수를 통하여 자신에서 네임필드를 초기화함
    public Member1(String name) {
        this.name = name;
    }

    //프라이빗 네임 필드를 다른페이지로 넘길려면 겟이 필요함
    public String getName() {
        return name;
    }

    //프라이빗 네임 필드의 값을 받을려면 셋이 필요함
    public void setName(String name) {
        this.name = name;
    }

   //  오버라이드를 해주지 않으면 주소값을 출력함.
    @Override
    public String toString() {
        return "이름: " + name;
    }
}
