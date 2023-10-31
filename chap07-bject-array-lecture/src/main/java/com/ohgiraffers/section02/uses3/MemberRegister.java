package main.java.com.ohgiraffers.section02.uses3;

public class MemberRegister {

    public void regist(Member[] members){
        for (Member member : members){
            System.out.println(member);
        }
        if (MemberRepository.store(members)){
            System.out.println(members.length+"등록");
        }
    }
}
