package com.carzyblitz.design.pattern.singleton.inner.clazz;

/**
 * 单例模式之静态内部类实现(static inner class and this is thread safe)
 * <br/>
 *  use private inner static class.when JVM load class,it is thread safe.
 * @author liuenyuan
 **/
public class SingletonPattern5 {

    private static SingletonPattern5 singleton = SingletonPattern5Holder.singleton;


    private SingletonPattern5() {
    }


    private static class SingletonPattern5Holder {
        private static SingletonPattern5 singleton = new SingletonPattern5();
    }


    public static SingletonPattern5 getInstance() {
        return singleton;
    }
}
