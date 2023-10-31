package main.java.com.ohgiraffers.section02.uses2;

public class MonsterRepo {

    private final static Member01[] m;

    private static int count;

    static {
        m = new Member01[15];
    }

    public static boolean store(Member01[] newM){
        for (int i = 0  ; i<newM.length; i++){
            m[count++] = newM[i];
        }

        return  true;
    }
    public static Member01[] findAllMembers(){
        return m;
    }
}
