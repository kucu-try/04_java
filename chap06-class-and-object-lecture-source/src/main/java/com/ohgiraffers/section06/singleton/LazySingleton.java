package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton {
    public static LazySingleton lazy;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }

}
