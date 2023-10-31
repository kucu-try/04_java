package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar(){
        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본 생성자를 호출하는 구문이다.
        * 해당 생성자가 호출 될 시 가장 먼저 car() 클래스 호출 내용이 출력될 것이다.
        * 명시적, 묵시적 전부 사용 가능하다.
        * */
        // firecar instance of car : car 와 firecar 는 같냐? 라는 뜻
        super();
    }

    @Override
    public void soundHorn(){
        if(super.isRunning()){
            System.out.println("빵아아아아앙");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없어~");
        }
    }

    //이 생성자는 상속 안된다 배열처럼 하나가 더 길기 때문
    public void sprayWater(){
        System.out.println("물을 뿌립니");
    }

}
