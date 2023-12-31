package main.java.com.ohgiraffers.section05;

import java.util.Date;

public class Application01 {
    public static void main(String[] args){

        /*
        * Date 클래스
        * jdk 1.0 부터 날짜를 취급하기 위해 사용되던 데이트 클래스
        * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되어 있다
        *
        * Deprecated?
        * 향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미
        * 하지만 하위 버전의 호환성 때문에 한 번에 제거되는 것은 아니고 남겨두었기 떄문에 사용하는 것은 가능하다
        *
        * jdk 1.1. 부터는 새롭게 제공되는 calendar 클래스를 이용하여 날짜와 시간에 관한 자리를 하게된다
        * 하지만 calendar 인스턴스는 몇가지 문제를 가지고 있다.
        * 1. 캘린더 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다
        * 2. 윤초(leep second)를 고려하지 않는다
        * 윤초란?
        * 협정 세계시에서 사용하는 세승 우너자 시계와 실제 지구의 자전 공정 속도를 기준으로 항 태양시의 차이로 인해
        * 발생한 오차를 보정하기 위해 추가하는 1초이다.
        * 12월 31일의 마지막에 추가하거나 혹은 6월 30일 마지막에 추가한다.
        * 윤초는 사소해 보이지만 실제 2012년 링크드인과 같은 규모 서비스의 서버를 마비시킨 버그를 발생한 젇고 있다.
        * 3.calendar 클래스는 월을 나타낼 때 8부터 11 까지로 표현하는 불편함이 있다
        *
        * jdk 1.8에서는 이러한 모든 문제를 해결할 수 있는 time 패키지를 제공하고 있다.
        *
        * Date는 java.sql.Date 와 java.util.Date 가 존재한다
        * 한클래스에서 두 개의 타입을 전부 사용하게 되면 import 를 하더라도 사용하는 타입이
        * 어느 패키지에 있는지 모호성이 발생되어 import를 하여도 클래스의 이름에 풀 패키지 경로를 입력해야 한다.
        * 주의하자
        *
        * */

        Date today = new Date();
        System.out.println(today);
        /* gettime()은 1970년 1월 0시 0분 0초 이루 지난 시간을 , millsecond로 계산하여 long 타입으로 반환한다*/
        System.out.println(today.getTime());
        Date time = new Date(1698815742589L);
        System.out.println(time);
    }
}
