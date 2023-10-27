package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {


    public Member[] findAllMembers(){
        //((no==2) - 4)
        return MemberRepository.findAllMembers();
    }
}
