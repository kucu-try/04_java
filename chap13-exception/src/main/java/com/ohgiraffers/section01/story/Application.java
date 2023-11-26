package main.java.com.ohgiraffers.section01.story;

public class Application {
    public static void main(String[] args) {
        /*
        * 개발관련 목표가 없던 지올팍
        * 그는 강사에게 과제를 받았다.
        * 과제는 job에 대한 조사를 하는 것이다
        * 생각보다 직업이 많아서
        * 고민을 하던 지올팍
        * 배열을 가지고 직업 리스트를 만들기로 하였다
        * */

        Jobs[] joblist = new Jobs[5];

        try{
            joblist[0] = new Jobs(1,"백엔드");
            joblist[1] = new Jobs(2,"프론트 엔드");
            joblist[2] = new Jobs(3,"데브옵스");
            joblist[3] = new Jobs(4,"DBA");
            joblist[4] = new Jobs(5,"PM");
            //ArrayIndexOutofBoundsException 가 발생됨에 따라서 프로그램이 동작을 멈춤
            joblist[5] = new Jobs(6,"PL");
            joblist[6] = new Jobs(7,"BigData");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{ //예외가 있든 없든 무조건 실행하는 구문
            System.out.println("실행됨");
        }



        for (int i = 0; i < joblist.length; i++) {
            System.out.println(joblist[i]);
        }
    }
}
