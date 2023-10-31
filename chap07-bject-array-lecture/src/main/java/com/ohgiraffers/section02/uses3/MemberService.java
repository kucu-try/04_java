package main.java.com.ohgiraffers.section02.uses3;

public class MemberService {
    public void signUpMembers(){
        Member[] members = new Member[5];

        members[0] = new Member(1,"a");
        members[1] = new Member(2,"b");
        members[2] = new Member(3,"c");
        members[3] = new Member(4,"d");
        members[4] = new Member(5,"e");

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers(){
        MemberFinder finder = new MemberFinder();

        for (Member member : finder.findAllMembers()){
            if (member != null){
                System.out.println(member);
            }
        }

    }
}
