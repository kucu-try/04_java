package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        //상속 클래스에서 T만 넣으면 다 ㅅ사용가능
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
      //  RabbitFarm<Rabbit> farm =new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
//        RabbitFarm<?> farm7 = new RabbitFarm(); // ? 라는 건 어떤 타입이 들어갈지 몰라라는 뜻 와일드 카드 // 상속 받은 것들 중에서만!
//
//        farm7.setAnimal(new Snake());
//

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
//        Object test = new Object();
//        ((Rabbit)test).cry();

        // Rabbit 의 호손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어 두었기 떄문에
        // <T extends Rabbit> 형변환이 생각가능하다.
        // 이유 T이 결정되어도 T의 값은  Rabbit의 후손일 것이기 떄문에
        farm4.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();
        farm6.getAnimal().cry();

        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());

    }
}
