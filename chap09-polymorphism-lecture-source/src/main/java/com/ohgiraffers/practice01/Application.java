package main.java.com.ohgiraffers.practice01;

public class Application {
    public static void main(String[] args){
        Shape circle = new Circle(5.0);
        Shape ractangle = new Ractangle(1.0,5.0);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(ractangle.calculatePerimeter());
        System.out.println(ractangle.calculateArea());
    }
}
