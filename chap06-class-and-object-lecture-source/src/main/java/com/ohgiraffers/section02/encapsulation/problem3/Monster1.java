package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Monster1 {
    String name ;
    int hp ;

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setName(String name){
        this.name = name ;
    }

    public String getInfo(){
        return "이름은 " + name + " 체력은 " + hp;
    }
}
