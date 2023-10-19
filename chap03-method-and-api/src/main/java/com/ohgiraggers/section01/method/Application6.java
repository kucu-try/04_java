package main.java.com.ohgiraggers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*
        * 메소드 리턴 값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때는 그냥 복귀할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        *
        *
        * return 값을 반환하기 위해서는 메소드 선언부에 리턴 타입을 명시해주어야함
        * void는 아무 반환값도 가지지 않겠다는 리턴어에 사용 키워드
        * 반환값이 없는 경우 리턴을 생략해도 컴파일러가 자동으로 추가
        * 반환값이 있는 경우는 리턴 구문을 반드시 사용해야한다.
        * 또한 메서드 선언부에 선언한 리턴 타입 반환 값의 자료형은 반드시 일치해야한다.
        * */

        System.out.println("main()메소드 시작함..../");

        /*
        * 메소드 작성 후 호출을 해보면 아무런 변화가 없으나 호출을 한 것이다
        * */

        Application6 app6 = new Application6();
        String returnValue = app6.test();
        System.out.println(returnValue + "함수가 전달한 값이 맞니?");


    }


    public String test(){
        return "Hellow word";
    }
}
