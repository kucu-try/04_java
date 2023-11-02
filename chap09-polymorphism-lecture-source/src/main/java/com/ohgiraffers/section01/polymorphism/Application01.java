package main.java.com.ohgiraffers.section01.polymorphism;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 다형성
        * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
        * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
        * 하나의 메소드 호출로 객체 별로 각기 다른 방법으로 동작하게 할 수 있다.
        *
        * 다형성은 객체 지향 프로그래밍 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
        * 객체 지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
        * 하지만 학습하기 어렵다는 단점을 가지고 있다.
        *
        * 다형성의 장점
        * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지 보수성과 생산성이 증가된다.
        * 2. 상속을 기반으로 한 기술이기 떄문에 상속 관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
        * 이러한 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
        * (다양한 기능을 사용하는데 있어서 관리해야할 메세지 종류가 줄어들게 된다.
        * 하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서는 오버로딩을 다형성으로 보기도 한다.
        * 다형성을 이해하기 쉬운 가장 좋은 예이기도 하다.
        * 하지만 이부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 사용한다
        * 3. 확장성이 좋은 코드를 작성할 수 있다.
        * 4. 결합도를 낮춰서 유지보수성을 증가 시킬 수 있다.
        * *///객체지향 설계 5원칙
        System.out.println("Animal 생성");
        Animal animal = new Animal();
        animal.cry();
        animal.eat();
        animal.run();

        System.out.println();
        System.out.println("Rabbit 인스턴스 생성");
        Rabbit rabbit =new Rabbit();
        rabbit.eat();
        rabbit.cry();
        rabbit.run();

        System.out.println();
        System.out.println("Tiger 인스턴스 생성");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.run();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

//        Rabbit r1 = (Rabbit) new Animal();
       // Tiger t1 = (Tiger) new Animal();
        //런타임 단계 (실행중에 나는 오류)
        System.out.println("동적 바인딩");
        System.out.println(animal1.getClass());
        animal1.cry();
        animal2.cry();


        //animal1.jump(); 불가능
        System.out.println("클래스 타입의 형변환 확인");
        ((Rabbit) animal1).jump(); // 부모를 래빗으로 형변환 해야 점프가 들어간다.
        // (동적바인딩은 아님) 컴파일 단계(프로그램 작성중 에나는 오류)

        System.out.println("형변환 오류");
//        ((Tiger) animal1).bite();
//        ((Rabbit) animal2).jump();

        //상속을 받은 타입도 함께 가지고 있는 형식을 다형성이라고 한다.
        System.out.println("instanceof 확인");
        System.out.println("animal1 이 tiger 와 같은지 확인 : " +(animal1 instanceof Tiger));
        System.out.println("animal1 이 tiger 와 같은지 확인 : " +(animal1 instanceof Rabbit));
        System.out.println("animal1 이 Animal과 같은지 : " + (animal1 instanceof Animal));
        System.out.println("animal 이 Rabbit 과 같은가 : " + (animal instanceof Rabbit));
        System.out.println("animal 이 Tiger 과 같은가 : " + (animal instanceof Tiger));

        /*
        * 클래스 형변환은 up-casting 과 down-casting 으로 구분됨
        * up-casting : 상위 타입으로 형변환
        * down-casting: 하위 타입으로 형변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다
        * */


        Animal animal3 = (Animal) new Rabbit(); // up-casting 명시적 형변환
        Animal animal4 = new Rabbit(); // 묵시적 형변환
        Rabbit rabbit1 = (Rabbit) new Animal(); // down -casting 명시적 형변환
      //  Rabbit rabbit2 = new Animal(); //묵시적 형변환이나 에러
    }
}
