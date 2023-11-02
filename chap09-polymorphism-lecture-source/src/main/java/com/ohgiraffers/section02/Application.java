package main.java.com.ohgiraffers.section02;

public class Application {

    public static void main(String[] args) {

        /*
        * 추상 클래스와 추상 메서드
        * 추상 메서드를 0개 이상 포함하는 클래스를 추상 클래스라고 한다.
        * 추상클새르는 클래스 선언부에 abstract 키워드를 명시해야한다.
        * 추사클래스로는 인스턴스를 생성할 수 없다
        * 추상클래스를 사용하려면 추상 클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야한다.
        *
        * 추상클래스에 작성한 추상 메서드는 반드시 후손이 오버라이딩 해서 작성해야하며
        * 추손 클래스들의 메소드들의 공통 인터페이스로의 역할을 수행할 수 있다
        * 추상 클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는
        * 다형성이 작용되어 동적 바인딩에 의해 다양한 응답을 할 수 있게 된다
        *
        * 추상 클래스를 상속받아 구현할 떄는 extends 키워드를 사용하며
        *  자바에서는 extecds 로 클래스를 상속받을 시 하나의 부모 클래스만 가질 수 있다. (단일 상속)
        *
        * 추상메소드란
        * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상 메서드라고 한다.
        * 추상 메서드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야한다.
        * ex) public abstract void method();
        *
        * 추상의 대한 이해하기
        * 출입 권한이 있는 카드를 발급 해준다고 생각을 해보자
        *  회사에서는 아무런 값이 정의되지 않은 카드가 있을것이고
        * 신규 사원이 입사를 하는 경우 사원의 직책과 직무에 맞춰 출입 가능한 구역을 허용한다고 생각을 하면된다.
        *
        *
        * */
//        SmartPhone smartPhone = new Product();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product product = new SmartPhone();
        product.abstractMethod();


    }
}
