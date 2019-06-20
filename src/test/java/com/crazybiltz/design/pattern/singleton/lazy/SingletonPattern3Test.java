package com.crazybiltz.design.pattern.singleton.lazy;

import com.carzyblitz.design.pattern.singleton.lazy.SingletonPattern3;
import com.carzyblitz.design.pattern.singleton.utils.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * @author liuenyuan
 * @see com.carzyblitz.design.pattern.singleton.lazy.SingletonPattern3
 **/
public class SingletonPattern3Test {

    /**
     * 测试单例模式之懒汉模式线程安全性
     *
     * @see SingletonPattern3#getInstance1()
     **/
    @Test
    public void testIsThreadSafe1() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                SingletonPattern3 singleton = SingletonPattern3.getInstance1();
                System.out.println(singleton);
            });
        }
    }


    /**
     * 测试单例模式之懒汉模式线程安全性
     *
     * @see SingletonPattern3#getInstance2()
     **/
    @Test
    public void testIsThreadSafe2() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                SingletonPattern3 singleton = SingletonPattern3.getInstance2();
                System.out.println(singleton);
            });
        }
    }
}
