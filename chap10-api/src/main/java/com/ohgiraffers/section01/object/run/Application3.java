package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
   /*
   * Object 클래스의 명세에 작성된 일반 규약에 따르면
   * equals() 메소드를 재정의 하는 경우 반드시 hashcode() 메소드도 재정의 하도록 되어있다.
   * 만약 해시코드를 재정의하지 않으면 같은 값ㄴ을 가지는 동등 객체는
   * 같은 해시코드 값을 가져야한다는 규약에 위반되게 된다.
   * (강제성은 없지만 규약대로 작성하는 것이 좋음)
   * */
    public static void main(String[] args) {
        Book book = new Book(1, "홍길동전","허균",5000);
        Book book1 = new Book(2, "목민심서","정약용",5000);
        Book book2 = new Book(3, "목민심서","정약용",5000);
        Book book3 = book;

        Application2 app = new Application2();

        System.out.println("book의 hashcode " + book.hashCode());
        System.out.println("book1의 hashcode " + book1.hashCode());
        System.out.println("book2의 hashcode " + book2.hashCode());

        Map<Book,String> map = new HashMap<>();
        //map key, value
        //key : 중복이 안되는 유일한 값
        //value : 중복이 가능한 값
        map.put(book,"selled");
        String str = map.get(book);
        System.out.println(str);


        }
    }



