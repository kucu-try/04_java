package main.java.com.ohgiraffers.section08.test2;

public class Member2 {
    private String name;

    public Member2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "이름 : " + name;
    }
}
