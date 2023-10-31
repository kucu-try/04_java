package main.java.com.ohgiraffers.section02.uses3;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }
}
