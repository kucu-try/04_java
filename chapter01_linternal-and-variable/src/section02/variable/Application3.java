package section02.variable;
public class Application3 {
    public static void main(String[] args){
        /*
        * 변수의 명명 규칙
        * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아니라 정해진 규칙이 있다
        * 실무적으로는 굉장히 중요하기 때문에 반드시 숙지
        * 또한 규칙에 맞는 올바른 변수명을 짓는것이 좋은 프로그래밍을 하는 첫 단추*/

        /*변수의 명명 규칙
        * 1. 컴파일 에러를 발생시키는 규칙
        *   1-1. 동일한 범위 내에서는 동일한 변수명을 가질수 없다
        *   1-2. 예약어는 사용이 불가능하다(예약어란 프로그램에서 미리 사용하겠다고 compiler와 약속한 키워드를 예약어라고함)
        *   1-3. 변수명은 대/소문자를 구분한다. (자바는 대/소문자르 엄격하게 구분하는 언어이다.)
        *   1-4. 변수명은 숫자로 시작할 수 없다. (시작하는 것만 불가능하고 숫자를 섞어서 사용하는 것은 가능하다)
        *   1-5. 특수 기호는 '_' 와 '$' 만 사용가능하다
        * 2. 컴파일 에러를 발생시키지 않지만 개발자들끼리의 암묵적인 규칙
        *   2-1. 변수명의 길이 제한은 없다(하지만 적당히 해야한다)
        *   2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번째 단어의 시작은 대문자로 한다
        *   2-3. 단어와 단어 사이의 연결은 언더스코어로(_)하지 않는다. (타언어 네이밍 규칙이다. snake-case
        *   2-4. 한글로 변수명을 짓는 것이 가능하지만 권장하지 않는다
        *   2-5 변수 안에 저장된 값이 어떤 의미를 가지는지를 명확하게 표현한다
        *   2-6 전형적인 변수 이름이 있다면 가급적 사용한다
        *   2-7 명사형으로 작성할 수 있도록 한다
        *   2-8 boolean 형은 의문문으로 가급적 긍정형태로 네이밍 한다*/

        // 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        int age = 20 ;
       // int age = 10 ;

        //목차 1-2 예약어는 사용이 불가능하다.
//        int true = 10;
//        int for = 20;

        //1-3 변수명은 대소문자로 구분함
        int Age = 20;
        int True = 30;

        //1-4 변수명은 숫자로 시작 할 수 없어
//        int 1test = 10;
        int test10 = 34;

        //1-5 특수 기호는 '_'와 '$'만 사용이 가능하다
        int _a_g_e = 10;
        int $test = 4;
//        int test* =3;

        //에러를 발생시키지는 않지만 개발자들 끼리의 암묵적인 규칙
        int asdfairehirghigihgrihaighri;

        // 2-2 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번 쨰는 대문자
        // 자바에서는 클래스명만 유일하게 대문자로 시작한다
        int MaxAge = 10; // 이렇게 해도 무방하나 사용하지 않아
        int maxAge = 15; //올바른 표현

        //2-3 단어와 단어 사이의 연결은 언더스코어(_) 사용하지 않는다
        String user_name; // 스네이크 케이스
        String userName; // 카멜 케이스

        //2-4 한글로 변수명을 짓는 것은 가능한데 권장 안해
        int 나이 ;

        // 2-5 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        String s;
        String name;

        // 2-6 전형적인 변수 이름이 있다면 가급적 사용
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 0;
        int cnt = 0;

        // 2-7 명사형으로 작성할 수 있도록 한다.
        String goHome; //가능한데 명사형으로 지어야한다
        String home;

        // 2-8 boolean 형은 의무문은 가급적으로 긍정의 형태를 갖는다.
        boolean isAlive = true;
        boolean isDead = false; // 부정보다는 긍정으로 짓는다.

//        int man1 = 100;
//        int man2 = 120;
//        int man3 = 130;
//        int man4 = 150;
//
//
//        System.out.println("김대리의 월급은 : " +man1+"만원 +" + (man1/2)+"만원으로 총 "+(man1+(man1/2))+"만원 입금되었습니다");
//        System.out.println("과장의 월급은 : " +man2+"만원 +" + (man2/2)+"만원으로 총 "+(man2+(man2/2))+"만원 입금되었습니다");
//        System.out.println("부장의 월급은 : " +man3+"만원 +" + (man3/2)+"만원으로 총 "+(man3+(man3/2))+"만원 입금되었습니다");
//        System.out.println("차장의 월급은 : " +man4+"만원 +" + (man4/2)+"만원으로 총 "+(man4+(man4/2))+"만원 입금되었습니다");

//        System.out.println("=============================================================={");
//        int man=50;
//
//        for (int i = 1; i < 101; i++) {
//            System.out.print("man"+i+"의 월급은 : " +man+"만원 +" + (man/2)+"만원으로 총 "+(man+(man/2))+"만원 입금되었습니다");
//            man += 50;
//
//            System.out.println("/n");
//        };

        int aManager = 100;
        int manager = 120;
        int gManager = 130;
        int dgManger = 150;


            for (int i = 1; i < 101; i++) {
                int random =  (int) (Math.random()*4);
                System.out.println(random);
                if (random == 0) {
                    System.out.println(i + "대리님 월금 : " + (aManager + (aManager / 2)));
                };
                if (random == 1) {
                    System.out.println(i + "과장님 월금 : " + (manager + (manager / 2)));
                };
                if (random == 2) {
                    System.out.println(i + "부장님 월금 : " + (gManager + (gManager / 2)));
                };
                if (random == 3) {
                    System.out.println(i + "차장님 월금 : " + (dgManger + (dgManger / 2)));
                };
                System.out.println("\n");
            };


    }
}
