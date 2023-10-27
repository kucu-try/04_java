package main.java.com.ohgiraffers.baduk;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //30개의 각 배열에 30개의 배열을 넣는다.
        String[][] baduk = new String[30][30];

        // 1 포문에서는 첫 번째 배열의 길이만큼 반복한다.(30번)
        // 1 포문 안에 있는 2 포문에서 바둑[i]의 길이만큼 반복한다.(30)
        for (int i = 0; i < baduk.length; i++) {
            for (int j=0; j < baduk[i].length; j++){
                baduk[i][j] = " ";
            }
        }
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        int turn = 1;

        while (test){
            System.out.println( ((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
            String[] index = scanner.nextLine().split("");
            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);

            if(turn % 2 == 0){
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "O";
                }else{
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            }else{
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "X";
                }else{
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j=0; j < baduk[i].length; j++){
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++;
        }
    }
}
