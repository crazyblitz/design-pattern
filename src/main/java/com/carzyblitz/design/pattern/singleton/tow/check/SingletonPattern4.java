package com.carzyblitz.design.pattern.singleton.tow.check;

/**
 * 单例模式之双重检锁模式(Double-Check)(线程不一定安全),需要加上{@code volatile}.
 * <br/>
 * 减少了同步的开销,结合了懒汉模式和饿汉模式的优点
 * <br/>
 * Due to  JVM reorder,this is not thread safe.In need you should use {@code volatile}
 * to prohibit(禁止) reorder.
 *
 * @author liuenyuan
 **/
public class SingletonPattern4 {

    private static volatile SingletonPattern4 singleton = null;


    private SingletonPattern4() {

    }


    public static SingletonPattern4 getInstance() {
        if (singleton == null) {
            synchronized (SingletonPattern4.class) {
                if (singleton == null) {
                    //初始化对象非原子操作
                    //1:分配内存空间
                    //2:初始化对象
                    //3:设置singleton指向刚分配的地址
                    singleton = new SingletonPattern4();
                }
            }
        }
        return singleton;
    }
}
