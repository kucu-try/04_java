package main.java.com.ohgiraffers.section03.uses;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) {
        /*
         * try-with-resource
         * jdk1.7에서 추가된 문법으로
         * close 해야하는 인스턴스의 경우 try 옆에 괄호안에서 생성하면
         * 해당 try0catch 블럭이 완료될 때 자동으로 close를 처리해준다
         * */
        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"));) {
            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
 }

