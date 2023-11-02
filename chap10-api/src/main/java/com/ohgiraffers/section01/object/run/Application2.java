package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 모든 클래스는 object 클래스의 후손이다.
         * 따라서 object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
         * 또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용하는 것도 가능하다.
         *
         * Object 클래스의 메소드 중 관례상ㅌ 많이 오버라이딩 해서 사용하는 메소드들이 있다
         * toString(), equals(), hashcode() 이다
         * */

        /*
        * equals() 메소드 오버라이딩
        * 이퀄스 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다
        * 즉 동일한 인스턴스인지를 비교하는 기능을 한다
        *
        * 동일객체와 동등객체
        * 동일객체 : 주소가 동일한 인스턴스를 동일 객체라고 한다.
        * 동등객체 : 주소는 다르더라도 필드 값이 동일한 객체를 동등객체라고 한다.
        * */

        Book book = new Book(1, "홍길동전","허균",5000);
        Book book1 = new Book(2, "목민심서","정약용",5000);
        Book book2 = new Book(2, "목민심서","정약용",5000);
        Book book3 = book;

        System.out.println("동일 객체 비교하기 " + (book.equals(book3)));
        System.out.println("동등 객체 비교하기" + (book1.equals(book2)));
        System.out.println("다른 객체 비교하기 " + (book2==book3));
    }
}
