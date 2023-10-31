package main.java.com.ohgiraffers.section02.uses2;

public class Manager {

    public void regist(){
        Member01[] m = new Member01[4];
        m[0] = new Member01(1,'C',"오크","오크의 피");
        m[1] = new Member01(2, 'B' , "오우거" , "오우거의 정수");
        m[2] = new Member01(3, 'A', "해수룡" , "바다의 돌");
        m[3] = new Member01(4, 'S' , "제천대성","여의봉, 화안금정");

        MonsterRegist mr = new MonsterRegist();
        mr.regist(m);
    }


    public void show(){
        MemberFinder finder = new MemberFinder();

        for (Member01 m1 : finder.findAllMember()){
            if(m1 != null){
                System.out.println(m1);
            }
        }

    }
}
