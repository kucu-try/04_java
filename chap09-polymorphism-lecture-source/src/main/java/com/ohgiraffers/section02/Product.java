package main.java.com.ohgiraffers.section02;

public abstract class Product { //abstract 는 무조건적으로 구현해야한다.
    public Product(){

    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod를 호출함");
    }


    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod");
    }

    public abstract void abstractMethod();


}
