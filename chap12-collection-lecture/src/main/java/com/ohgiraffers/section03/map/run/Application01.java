package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

import static javax.swing.UIManager.put;

public class Application01 {
    public static void main(String[] args) {
        /*
        * Map 인터페이스의 특징
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키(Key) 와 값(value) 를 하나의 쌍으로 저장하는방식을 사용한다.
        *
        * key(키) 란?
        * 값(value) 를 찾기 위한 이름 역할 하는 객체를 의미
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
        *
        * hashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
        * HashMap 이 가장 많이 사용되며 Hashtable은 jdk 1.0부터 제공
        * HashMap 과 동일하게 동작한다. 하위 호환을 위해 남겨 놓았기 떄문에 가급적이면 HashMap을 사용하는거이 좋다
        * */

        /*
        * HashMap
        * jdk1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다
        * */

        HashMap hmap = new HashMap();
     //   Map hmap2 = new HashMap();
        hmap.put("one" , new Date());
        hmap.put(12, "red Apple");
        hmap.put(33, 123);
        System.out.println(hmap);

        hmap.put(12, "yellow");
        System.out.println(hmap);

//        hmap.remove(12);
        System.out.println(hmap);
        System.out.println(hmap.get(12));
        System.out.println(hmap);
        System.out.println(hmap.get(33));
//        hmap.remove(33);
        System.out.println(hmap.get(33));
        System.out.println("===================");
        Collection<String> values = hmap.values();

        for (Object obj: values) {
            System.out.println(obj);
        }

        Iterator valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("iter : " + valueIter.next());
        }
    }
}
