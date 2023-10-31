package main.java.com.ohgiraffers.section02.uses2;

public class Member01 {
    private int num;
    private String name;

    private char rank;

    private String item;


    public Member01(int num, char rank, String name, String item){
        this.name = name;
        this.rank = rank;
        this.num = num;
        this.item = item;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Member01{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", item='" + item + '\'' +
                '}';
    }
}
