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
        //불리안 테스트에 트루를 왜했지?
        boolean test = true;
        //입력 받기 위해 호출
        Scanner scanner = new Scanner(System.in);
        //턴에 왜 1을?
        int turn = 1;

        //와일에 트루가 들어간 테스트가 들어가면 무한반복이다.
        while (test){
            //처음에는 1을 넣은 턴을 나머지 2로하면 1이나와서 거짓이 되기에 청팀님 차례입니다를 출력한다.
            System.out.println( ((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
            //스트링 배열인 인덱스라는 변수를 생성하고 입력을 받는 값을 넣었다. 스플릿을 기준으로 한 스캐너에 여러 타입을 입력 가능하게 해준다.
            String[] index = scanner.nextLine().split("");
            //스트링 입력 값 내용에 있는 숫자 문자열을 정수형 숫자로 바꿔주는 역할을 한다. 인테저 파스 인트는!
            int first = Integer.parseInt(index[0]);
            // 퍼스트, 세컨드 입력 값을 정수형으로 바꿨다.
            int second = Integer.parseInt(index[1]);

            //청팀
            if(turn % 2 == 0){
                //바둑 배열의 모든 값은 현재 " " 이기에 항상 입력받은 값은 "O"를 출력한다.
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "O";
                    //같은 곳에 두었을 때 다시 둘수 있게 한다.
                }else{
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
                //바둑 배열의 모든 값은 현재 " " 이기에 항상 입력받은 값은 "X" 를 출력한다.
            }else{
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "X";
                    //같은 곳에 두었을 때 다시 둘 수 있게 한다.
                }else{
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            }

            //바둑 배열의 길이 30만큼 반복한다.
            for (int i = 0; i < baduk.length; i++) {
                //큰 포문이 돌때마다 "|" 를 출력한다. 30번
                System.out.print("|");
                //30번에서 각 번마다 30번씩 반복한다.
                for (int j=0; j < baduk[i].length; j++){
                    // " " 와 "|"를 모든 배열 값에서 출력한다. 900번
                    System.out.print(baduk[i][j] + "|");
                }
                // 바둑의 i배열의 출력이 끝난 후 줄을 바꿔준다.
                System.out.println();
            }
            //상대편 차례로 바꾸기 위해 턴에 1을 더해준후 다시 와일 문을 실행한다.
            turn++;
        }
    }
}
