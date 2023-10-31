package main.java.com.ohgiraffers.section02;

public class SuperClass {
    /*
    오버라이딩의 대하여 이해를 해보자
    오버라이딩이란
    부모 클래스에서 상속받은 메서드를 자식클래스에서 재정의하여 사용하는 것이다.

    오버라이딩 성립요건
    1.메소드의 이름이 동일해야한다.
    2. 메소드의 리턴 타입이 동일해야한다.
    3. 매개변수의 타입, 갯수, 순서가 동일해야한다.
    4. private 메소드는 접근이 불가능하기 떄문에 오버라이딩이 불가능하다.
    5. final 키워드가 사용된 메소드는 오버라이딩이 불가능하다.
    6. 접근제한자는 부모메서드와 같거나 더 넓은 범위여야한다.
    7. 예외 처리는 같은 예외이거나 더 구체적인 (하위) 인 예외를 처리해야한다. ( 예외는 exception에서 다를 것이다.
    */

        public void method(int num){}
        private void privateMethod(){}
        public final void finalMethod(){}
        protected void protectedMethod(){}

}
