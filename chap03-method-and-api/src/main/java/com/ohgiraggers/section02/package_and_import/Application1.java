package main.java.com.ohgiraggers.section02.package_and_import;

import main.java.com.ohgiraggers.section01.method.Calculator;


public class Application1 {
    public static void main(String[] args) {
        /*
        * 페키지란?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음 으로 단위를 구성하는 것이다
        * 같은 패기지 내에서는 동일한 이름의 클래스를 만들수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들수 있다
        * 클래스명은 원래 패키지 명을 포함하고 있기 때문이다
        * 지금까지는 클래스 명에 패키지명을 함께 사용하지 않ㄴ은 이유는 동일한 패키지 내에서 사용했기 떄문이다.
        * 그렇기 떄문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는 클래스명앞에 패키지명을 명시해서 클래스 이름으로 사용해야한다
        * */

        Calculator cal = new main.java.com.ohgiraggers.section01.method.Calculator();

        System.out.println(cal.minNumberOf(1,2));
        System.out.println(main.java.com.ohgiraggers.section01.method.Calculator.maxNumberOf(1,2));
    }
}
