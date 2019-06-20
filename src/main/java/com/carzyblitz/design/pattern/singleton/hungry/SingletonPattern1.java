package com.carzyblitz.design.pattern.singleton.hungry;

/**
 * 单例模式之饿汉模式(thread safe).
 * <br/>
 * 类初始化的时候,会立即加载该对象,<b>线程天生安全</b>,调用效率高.
 *
 * @author liuenyuan
 **/
public class SingletonPattern1 {

    private static SingletonPattern1 singleton = new SingletonPattern1();


    private SingletonPattern1() {

    }


    public static SingletonPattern1 getInstance() {
        return singleton;
    }

}
