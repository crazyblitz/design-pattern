package com.carzyblitz.design.pattern.singleton.lazy;

/**
 * 单例模式之懒汉模式(not thread safe).如果需要线程安全,需要进行加锁.
 * <br/>
 * 类初始化时,不会初始化该对象,真正需要使用的时候才会去创建该对象,具备懒加载功能.
 * <br/>
 *  需要使用{@code synchronized} or {@link java.util.concurrent.locks.ReentrantLock} to keep thread safe.
 * @author liuenyuan
 **/
public class SingletonPattern2 {

    private static SingletonPattern2 singleton = null;


    private SingletonPattern2() {

    }


    public static SingletonPattern2 getInstance() {
        if (singleton == null) {
            singleton = new SingletonPattern2();
        }
        return singleton;
    }
}
