package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개 변수로 받을 때
        * 그 객체의 타입 변수를 제한 할 수 있다.
        * <?> : 제한없음
        * <? extends Type> : 와일드카드의 상한 제한(Type 과 Type의 후손을 이용해 생성한 인스턴스만 인자로허용)
        * <? super Type> : 와일드 카드 하한 제한(Type 과 Type의 부모를 이용해서 생성한 인스턴스만 인자로 허용)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        WildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile())); 관련이 없어 오류

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));

        //RabbitFarm<T extends Rabbit> 으로 타입이 지정되어 있기 떄문에
        //superType(RabbitFarm<? super Bunney>)로 정의를 하게 되면
        // 허용 범위가 Rabbit~ Bunny 사이의 조상만 허용이 가능하게 된다.
//        wildCardFarm.superType(new RabbitFarm<Mammal>(new Mammal()));
//        RabbitFarm<Reptile> test = new RabbitFarm<>(); //오브젝트
//        wildCardFarm.superType(new RabbitFarm<Reptile>(new Snake()));

        //superType(RabbitFarm<? super Bunney>)로 정의가 되어있기 떄문에
        //Bunny 와 관련이 없는 Reptile 타입을 지시할 수 없게 되는 것이다.

//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
