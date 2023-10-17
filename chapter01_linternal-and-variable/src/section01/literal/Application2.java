package section01.literal;

public class Application2 {

    public static void main(String[] args){
        /*수업 목표/ 정수 리터링 형식의 값을 직접 연산한다.*/
        /*
        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 /10
        * 5. 10 % 2
        * */
        System.out.println(123+456);
        System.out.println(123-456);
        System.out.println(123*456);
        System.out.println(40/10);
        System.out.println(10%2);

        /* 실수와 실수 리터널 연산 */

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);

        System.out.println("=================");

        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 1.0);

        System.out.println(("-----------------문자와 문자의 연산------------"));

        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        //문자열과 연산은 다 문자열로 표시
        System.out.println("---------문자열과 다른 형태의 값 연산-----------");
        System.out.println("hellow"+1004);
        System.out.println(true);

        System.out.println("123" + "456");
        /*논리값 연산*/
        /*4-1 논리값과 논리값 연산*/
        System.out.println("true" + false);

    }
}
