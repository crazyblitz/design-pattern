package com.carzyblitz.design.pattern.singleton.lazy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式之懒汉模式(thread safe).使用{@code synchronized} 或者 {@link java.util.concurrent.locks.ReentrantLock}.
 *
 * @author liuenyuan
 * @see java.util.concurrent.locks.Lock
 **/
public class SingletonPattern3 {

    private static SingletonPattern3 singleton = null;

    private final static Lock LOCK = new ReentrantLock();

    private SingletonPattern3() {
    }


    public static SingletonPattern3 getInstance1() {
        synchronized (SingletonPattern3.class) {
            if (singleton == null) {
                singleton = new SingletonPattern3();
            }
        }
        return singleton;
    }


    public static SingletonPattern3 getInstance2() {
        try {
            LOCK.lock();
            if (singleton == null) {
                singleton = new SingletonPattern3();
            }
        } finally {
            LOCK.unlock();
        }
        return singleton;
    }
}
