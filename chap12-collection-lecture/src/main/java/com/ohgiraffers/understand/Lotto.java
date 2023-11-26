package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        // HashMap을 사용하여 로또 번호 저장
        HashMap<String, Set<Integer>> lottoNumbers = new HashMap<>();

        // 로또 번호 생성 및 저장
        for (int i = 1; i <= 10; i++) {
            Set<Integer> lottoSet = generateLottoNumbers();
            lottoNumbers.put("로또 " + i, lottoSet);
        }

        // 당첨 번호 생성
        Set<Integer> winningNumbers = generateLottoNumbers();

        // 당첨자 확인
        boolean winnerFound = false;
        for (Map.Entry<String, Set<Integer>> entry : lottoNumbers.entrySet()) {
            String lottoKey = entry.getKey();
            Set<Integer> userNumbers = entry.getValue();

            if (userNumbers.equals(winningNumbers)) {
                System.out.println("당첨 번호가 있습니다.");
                System.out.println("행운 번호: " + userNumbers);
                System.out.println("당첨 번호: " + winningNumbers);
                winnerFound = true;
                break;
            }
        }

        if (!winnerFound) {
            System.out.println("당첨 번호가 없는 경우");
            System.out.println("행운 번호: " + winningNumbers);
            System.out.println("이번 회차 당첨자 없음");
        }
    }

    // 중복되지 않는 6자리 로또 번호 생성
    public static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoSet = new HashSet<>();
        Random random = new Random();

        while (lottoSet.size() < 6) {
            int number = random.nextInt(45) + 1;
            lottoSet.add(number);
        }

        return lottoSet;
    }
}











