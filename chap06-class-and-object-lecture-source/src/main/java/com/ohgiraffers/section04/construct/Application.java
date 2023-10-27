package main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args) {
        /*
        * 생성자란?
        * 인스턴스를 생성할 떄 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor) 라고 하며
        * 기본 생성자는 conpiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다
        * 인스턴스 생성시 별도로 수행할 명령이 없었기 떄문에 아무것도 작성하지 않은 것이다.
        * */


        //참조 자료형==레퍼런스 타입
//        User user; // 변수를 선언

        User user = new User(); //변수를 생성한다.




        System.out.println();
    }
}
