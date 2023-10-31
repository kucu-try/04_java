package main.java.com.ohgiraffers.section02;

public class SubClass extends SuperClass{

    //메소드 이름을 변경하면 에러가 발생된다.
    //아래의 경우 오버라이드가 아닌 다른 함수로 취급이 된다.
//    @Override
//    public void method(int num) {
//        super.method1(num);
//    }


    // 메소드의 리턴 타입이 변경되면 에러가 발생된다.
//    @Override
//    public int method(int num) {
//        return num;
//    }


    //3. 메서드의 시그니처가 달라도 오류가 발생된다.
    //아래의 경우 오버로딩이다.
//    @Override
//    public void method(int num, int num2) {
//        super.method(num);
//    }
//

    @Override
    public void method(int num) {
        System.out.println("ddddd");
    }

    //4.private 접근제한자는 자신만 접근할 수 있기 떄문에 오류
//    @Override
//    public void privateMethod(){
//
//    }

    //5.
//    @Override
//    public final void finalMethod(){
//
//    }

//7. 부모 메소드의 접근 제한자와 같거나 더 넓은 범위로
    //오버라이딩이 가능하다.
    // 더 좁은 범위는 불가능
//    @Override
//    void protectedMethod() {
//        super.protectedMethod();
//    }

//    @Override
//    protected void protectedMethod(){}

    @Override
    public void protectedMethod(){}
}
