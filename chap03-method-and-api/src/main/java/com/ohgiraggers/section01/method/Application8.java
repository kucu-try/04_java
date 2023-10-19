package main.java.com.ohgiraggers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /*
        * static 메서드
        *
        *
        * static 메소드를  호출하는 방법
        * 클래스.메소드명();
        * */
        //권장하지 않는다
//        Application8 app1 = new Application8();
//        int result = app1.sumToNumbers(1,2);

        //권장한다 아주 권장해
        int result =Application8.sumToNumbers(1,2);

    }

    public static int sumToNumbers(int num1, int num2){

        return num1 + num2;
    }
}
