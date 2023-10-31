package main.java.com.ohgiraffers.made01;

import java.util.Scanner;

public class UserAuthenticationSystem {
    private static final int MAX_USERS = 3;
    private static String[] usernames = new String[MAX_USERS];
    private static String[] passwords = new String[MAX_USERS];
    private static int userCount = 0;



    // 회원가입 메서드
    private static void registerUser(String username, String password) {
        usernames[userCount] = username;
        passwords[userCount] = password;
        userCount++;
        System.out.println("가입이 완료되었습니다.");
    }

    // 로그인 인증 메서드
    private static boolean authenticateUser(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                return true;
            }
        }
        return false;
    }
}
