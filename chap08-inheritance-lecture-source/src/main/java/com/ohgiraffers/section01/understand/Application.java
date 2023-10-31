package main.java.com.ohgiraffers.section01.understand;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;
import main.java.com.ohgiraffers.section01.understand.imployee.Seller;

public class Application {
    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램 입니다.");

        System.out.println("전기차");
        ElectricCar ionic = new ElectricCar("H", 1000, "ionic1", "1000Km");
        ElectricCar ionic2 = new ElectricCar("H", 1500, "ionic2", "1500Km");
        ElectricCar ionic3 = new ElectricCar("H", 2000, "ionic3", "2000Km");
        ElectricCar kona = new ElectricCar("H", 2100, "kona", "2100Km");

        System.out.println("내연기관 차");
        OldCar porter = new OldCar("H", 1500, "poter", "diesel");
        OldCar avante = new OldCar("H", 1500, "avante", "Gasoline");
        OldCar sonata = new OldCar("H", 2000, "sonata", "Gasoline");

        System.out.println("영업 사원 입사");

        Seller seller =new Seller("노홍철");

//        OldCar[] sellers = {porter, avante,sonata,porter};
//        seller.oldCarSale(sellers);
//
//        ElectricCar[] electricCars = {ionic3, ionic2, ionic,kona};
//        seller.electricCarSale(electricSellers);

        Car[] cars ={porter,kona, ionic2,sonata,avante};
        seller.sale(cars);
        System.out.println(seller);

//        Car car = new Car("h" ,100);
//        System.out.println("car 와 oldcar 가 같은지 비교" +(car instanceof OldCar));
        System.out.println("형변환");
        Car car2 = kona;
        System.out.println(car2 instanceof OldCar);
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("형변환 후 다시 형변환");
        kona = (ElectricCar) car2;
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(kona instanceof ElectricCar);
    }
}
