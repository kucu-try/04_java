package main.java.com.ohgiraffers.practice01;

public class Ractangle implements Shape{

    private double width;
    private double height;

    public Ractangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return width*2 + height*2;
    }
}
