package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args) {
        Monster monster = new Monster();
        System.out.println(monster.hashCode());

        monster.name = "두치"; //1057941451.name
        monster.hp = 200;  //1057941451.hp



        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);


        Monster monster2 =new Monster();
        System.out.println(monster2.hashCode());
        //157627094
        monster2.name = "뿌꾸"; //157627094.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2 의 name :"+ monster2.name);
        System.out.println("monster2 의 hp : "+monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3 name " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.name = "프랑켄";
        monster4.setHp(1000);
        System.out.println("monster4 name " + monster4.name);
        System.out.println("monsteer4 hp " + monster4.hp);
    }
}
