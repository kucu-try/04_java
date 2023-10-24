package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {
    public static void main(String[] args) {
        Monster monster = new Monster();
        /*
        * 참조 자료형의 필드가 변경되는 겨웅 직접 참조를 하는 필드의 모든 값을 변경해야하는 문제가 발생된다.
        * */

        Monster monster2 =new Monster();

        //157627094
        monster2.kind = "뿌꾸"; //157627094.name = "뿌꾸";
        monster2.hp = -200;
      //  System.out.println("monster2 의 kind :"+ monster2.kind);
        System.out.println("monster2 의 hp : "+monster2.hp);

        Monster monster3 = new Monster();
        monster3.kind = "드라큘라";
        monster3.setHp(-200);
      //  System.out.println("monster3 kind " + monster3.kind);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.kind = "프랑켄";
        monster4.setHp(1000);
       // System.out.println("monster4 kind " + monster4.kind);
        System.out.println("monsteer4 hp " + monster4.hp);
    }
}
