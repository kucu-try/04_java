package main.java.com.ohgiraggers.section01.method;

public class Apllication {
    public static void main(String[] args) {

        /*
        * 메소드란?
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main()메서드 시작됨.");
        Apllication app1 = new Apllication();
        app1.methodA();


    }

  public void methodA(){
      System.out.println("a");
      methodB();
      System.out.println("f");
  }

  public void methodB(){
      System.out.println("b");
      methodC();
      System.out.println("e");
  }
    public void methodC(){
        System.out.println("c");
        System.out.println("d");
    }


}
