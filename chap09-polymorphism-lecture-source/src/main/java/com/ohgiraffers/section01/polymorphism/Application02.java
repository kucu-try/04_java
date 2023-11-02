package main.java.com.ohgiraffers.section01.polymorphism;

public class Application02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++){
            animals[i].cry();; //동적 바인딩
        }

        for (Animal animal : animals) {
            if (animal instanceof Rabbit){
                ((Rabbit) animal).jump();
            }else {
                ((Tiger)animal).bite();
            }
        }
    }
}
