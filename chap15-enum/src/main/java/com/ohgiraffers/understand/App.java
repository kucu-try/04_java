package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.HType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //회원 제한은 없으며 체력을 관리해야한다.
        //10명의 회원 유형도 자율이다.

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("백종환",60));
        members.add(new MemberDTO("유광중",60));
        members.add(new MemberDTO("정민식",50));
        members.add(new MemberDTO("박지호",60));
        members.add(new MemberDTO("정유환",50));
        members.add(new MemberDTO("이창주",60));
        members.add(new MemberDTO("홍성혁",50));
        members.add(new MemberDTO("김진규",70));
        Scanner sc = new Scanner(System.in);
        String[] value = sc.nextLine().split(" ");
        HType power = HType.벌크업;
        HType thin = HType.감량;
        HType yoga = HType.요가;
        HType ghost = HType.유령;
        HType diet = HType.다이어트;

        for (int i = 0; i < members.size(); i++) {
            String result = value[i];
            members.get(i).setType(power);
        }
        System.out.println(members);

    }
}
