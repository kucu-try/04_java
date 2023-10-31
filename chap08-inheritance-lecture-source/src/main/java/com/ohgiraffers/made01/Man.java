package main.java.com.ohgiraffers.made01;

import java.util.Scanner;

public class Man extends Membership{
    String b1 ="            _____               ";
    String b2 ="            |' '|               ";
    String b3 ="              |                 ";
    String b4 ="         >----|----<            ";
    String b5 ="             _|_                 ";
    String b6 ="            /  /                ";
    String b7 ="           /  /                ";
    String b8 ="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    String[] all = new String[]{b1,b2,b3,b4,b5,b6,b7,b8};
    private static int count;
    static {
        count = 6;
    }

    public void body(){
        for (String line : all) {
            System.out.println(line);

        }

    }

    public void ranNum() {

            body();
            System.out.println("방에 갖혔습니다.");
            System.out.println("문제를 못푸시면 물에 빠져 사망합니다!");
            System.out.println("콸 콸 콸!!!");
            loop:while (true) {
                Scanner sc = new Scanner(System.in);
                int num1 = (int) (Math.random() * 15);
                int num2 = (int) (Math.random() * 15);
                int answer = num1 * num2;

                System.out.println(num1 + " X " + num2 + " = ");
                int please = sc.nextInt();
                if (answer == please) {
                    System.out.println("아무일도 일어나지 않습니다.");
                } else {
                    System.out.println("물이 차오릅니다.");
                    for(int i = 7; i > count; i--){
                        all[count] = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
                    }count--;
                }body();
                if(all[0].equals("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")){
                    System.out.println("사망했습니다.");
                    break loop;
                }
            }

        }


}
