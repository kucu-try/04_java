package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSipmleForStatement() {
        /*
         * for[표현식]
         *
         * for(초기값; 조건식; 증감식){
         *
         * }
         * */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public void testForExample(){
        //반의 학생이 10명인 학생의 이름을 입력받기

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("1번째 학생의 이름을 입력해주세요: ");
//        String name1 =scanner.nextLine();
//
        for(int i = 1; i<10; i++){
            System.out.println(i + "번째 학생의 이름을 입력 바람: ");
            String student = scanner.nextLine();
            System.out.println(i + "번째 학생의 이름은"+student+"입니다");
        }

    }
    public void testForExample2(){
        // 1~10까지의 수의 합을 구한다.
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);

        //반복문에서 조건문 사용하기

        for(int i =0; i<=10; i++){
            if(i%2 ==0){
                System.out.println("짝수입니다");
            } else if( i == 0 ){
                System.out.println("0입니다");
            }else {
                System.out.println("홀수 입니다...");
            }
        }
    }

    public void testForExample4(){
        /*숫자 두개를 입력받아 작은 수에서 큰 수까지 합계를 구하세요
        * 딘. 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.
        * */

        /* 프로그램
        * 목표 : 두 수를 입력 받아서 작은 수부터 큰 수까지 합계를 구한다.
        * 주의 : 두 수의 값은 같을 수 없다.
        *
        * 1. 두 수를 입력받아야 한다.
        * 2. 입력 받은 수가 같은지 비교한다
        * false. 같지 않다면 다음으로 넘긴다.
        * True. 같으면 두 수를 다시 입력받는다.
        * 3. 같지 않다면 작은 수와 큰 수를 구한다.
        * 4. 작은 수부터 큰수까지의 합계를 구한다.
        * */
        System.out.println("두 수를 입력받아 작은 수부터 큰수까지의 합계를 구하는 프로그램");
//        1. 두 수를 입력받아야 한다.
        Scanner sc =new Scanner(System.in);
        System.out.println("첫 번쨰 수 입력: ");
        int first = sc.nextInt();
        System.out.println("두 번쨰 수 입력:");
        int second = sc.nextInt();
//        2. 입력 받은 수가 같은지 비교한다.

        for(;;){
            if(first == second){ //입력을 다시 받는다.
                System.out.println("두 수의 값이 같습니다");
                System.out.println("첫번 째 수를 다시 입력해주세요 :");
                first = sc.nextInt();
                second =sc.nextInt();
            }else { // 같지 않다면 다음 진행
               // 3. 같지 않다면 작은 수와 큰 수를 구한다.
                int max = (first>second) ? first : second;
                int min = (first<second) ? first : second;
                int sum = 0;
                //        4. 작은 수부터 큰수까지의 합계를 구한다.
                for(int i = min; i <= max; i++){
                    sum += i;
               }
                System.out.println("입력한 두 수에서 작은 값은" +min+" 큰 값은 "+max+"이고 합계는 "+sum+"입니다.");
                break;
            }
        }
    }
    /**
     * 구구단을 위한 함수입니다/
     * n~9단까지의 구구단
     * @param //first : 해당 단을 출력함
     * @return void
    * */

    public void gugudan(int num){
        Scanner sc = new Scanner(System.in);
        int number =0;

        //추가사항 - 입력한 수의 수 단까지 구구단을 출력하라
        //          10이상 입력시에도 9단까지만 출력하게 한다.
        //          2의 배수의 구구단은 제외한다.
        for(;;){
            if (num < 1) {
                System.out.println("구구단할 숫자를 다시 출력하시오: ");
                num = sc.nextInt();
            }else if(num < 9){
                for(int i = 1; i <= num; i++){
                    if(i % 2 == 1){
                        for (int j=1; j<10; j++){
                            System.out.println(i+"단 : " + i * j);
                        }
                    }

                }break;
            }else{
                for (int i = 1; i <10; i++) {
                    if (i % 2 ==1){
                        for (int j = 1; j < 10; j++) {
                            System.out.println(i + "단 : " + i * j);
                        }
                    }
                }break;
            }
        }



    }

}
