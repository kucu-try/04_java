package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Lotto2 {
    public static void main(String[] args) {
        HashMap<String, Set<Integer>> lottoNumbers = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            Set<Integer> lottoSet= generateLottoNumbers();
            lottoNumbers.put("로또 " + i, lottoSet);
        }

        //잭팟 번호 생성
        Set<Integer> winningNumbers = generateLottoNumbers();

        boolean winnerFound = false;
        for (Map.Entry<String, Set<Integer>> entry : lottoNumbers.entrySet()){
            Set<Integer> userNumbers = entry.getValue();

            if (userNumbers.equals(winningNumbers)) {
                System.out.println("당첨!");
                System.out.println("행운 번호 : " + userNumbers);
                System.out.println("당첨 번호 : " + winningNumbers);
                winnerFound =true;
                break;
            }
        }

        if (!winnerFound){
            System.out.println("아무도 당첨 못했습니다.");
            System.out.println("행운 번호 : " +winningNumbers);
        }


    }

    public static Set<Integer> generateLottoNumbers(){
        Set<Integer> lottoSet = new HashSet<>();
        Random random = new Random();

        while (lottoSet.size() < 6){
            int number = random.nextInt(45)+1;
            lottoSet.add(number);
        }

        return lottoSet;
    }
}
