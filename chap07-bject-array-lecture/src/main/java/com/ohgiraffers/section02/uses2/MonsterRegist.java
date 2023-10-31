package main.java.com.ohgiraffers.section02.uses2;

public class MonsterRegist {
    public void regist(Member01[] m){
        System.out.println("몬스터 등록");
        for (Member01 monster : m){
            System.out.println(monster +
                    "등록함.");
        }
        if(MonsterRepo.store(m)){
            System.out.println(m.length + "마리 등록!");
        }
    }
}
