package main.java.com.ohgiraffers.section02.uses;

public class MemberService {

    public void signUpMembers(){ // (no ==1) -2)
        //Member[] 배열의 size를 5로 만들어줌
        Member[] members = new Member[5];
        //Member 배열에 Member 클래스를 생성하여 값을 넣어줌
        members[0] = new Member(1,"user01","pass","홍길동" , 20, '남');
        members[1] = new Member(2,"user02","pass","유관순" , 22, '여');
        members[2] = new Member(3,"user03","pass","이순신" , 25, '남');
        members[3] = new Member(4,"user04","pass","신사임" , 206, '여');
        members[4] = new Member(5,"user05","pass","윤봉길" , 2, '남');
        // ((no==1) -3) memberRegister를 생성함
        MemberRegister memberRegister = new MemberRegister();
        //((no == 1) -4) memberRegister.regist()메서드에 Member[] 를 매개변수로 전달하여 해당 메서드를 호출함
        memberRegister.regist(members);
    }

    public void showAllMembers(){
        //finder 이름의 MemberFinder를 복제한다. ((no==2) - 2)
        MemberFinder finder = new MemberFinder();

        System.out.println("---가입된 회원 목록 -----");
        //Member 자료형의 member 에 MemberFinder에 있는 findAllMembers() 배열이 끝날때까지 넣는다.. ((no==2) - 3)
        for (Member member : finder.findAllMembers()) {
            //member 널이 아닐 때 member를 출력한다.
            if(member != null){
                //((no==2) - 6) findAllMembers()에서 불러온 member를 출력한다.
                System.out.println(member);
            }
        }
        System.out.println("----회원 조회 완료----");
    }
}
