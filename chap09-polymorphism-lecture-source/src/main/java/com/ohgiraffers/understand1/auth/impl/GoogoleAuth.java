package main.java.com.ohgiraffers.understand1.auth.impl;

import main.java.com.ohgiraffers.understand1.auth.SnsAuth;
import main.java.com.ohgiraffers.understand1.dto.MemberDTO;
import main.java.com.ohgiraffers.understand1.auth.SnsAuth;
import main.java.com.ohgiraffers.understand1.dto.MemberDTO;

public class GoogoleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO googleMember = new MemberDTO("google", "pass");

        if(!googleMember.getId().equals(memberDTO.getId())){
            System.out.println("구글 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!googleMember.getPass().equals(memberDTO.getPass())){
                System.out.println("구글 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
