package main.java.com.ohgiraffers.section04.sort;

public class Test02 {
    public static void main(String[] args){
//        <문제2>
//                피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
//        1. 결과값: {1 1 2 3 5 8 13 21 34}
//        2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
//        3. 9개 까지 출력한다.
        int[] fibo = new int[9];
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 2 ; i < fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.print("{ ");
        for (int num : fibo){
            System.out.print(num +" ");
        }
        System.out.println(" }");

    }
}
