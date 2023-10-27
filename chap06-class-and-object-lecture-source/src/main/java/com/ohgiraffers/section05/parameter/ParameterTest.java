package main.java.com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimarytypeParameter(int num){
        System.out.println("매개변수로 전달받은 값: " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.print("매개 변수로 전달받은 값 :" + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i=0; i< iarr.length; i++){
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RactAngle ractAngle){
        System.out.println("매개변수로 전달 받은 값: " +ractAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 =====");
        ractAngle.calcArea();
        ractAngle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 ======");
        ractAngle.setWidth(100);
        ractAngle.setHeight(50);
        ractAngle.calcArea();
        ractAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobby){ //...몇개 받을지 모를떄 쓴다.
        System.out.println("이름 : "+name );
        System.out.println("취미의 개수 : " + hobby.length);
        System.out.println("취미 : ");

        for (String hoddy : hobby){
            System.out.println(hoddy + " ");
        }
        System.out.println();
    }
}
