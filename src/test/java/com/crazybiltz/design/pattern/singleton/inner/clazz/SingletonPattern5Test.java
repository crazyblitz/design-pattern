package com.crazybiltz.design.pattern.singleton.inner.clazz;

import com.carzyblitz.design.pattern.singleton.inner.clazz.SingletonPattern5;
import com.carzyblitz.design.pattern.singleton.utils.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * @see com.carzyblitz.design.pattern.singleton.inner.clazz.SingletonPattern5
 **/
public class SingletonPattern5Test {


    /**
     * 测试单例模式之静态内部类实现线程安全性
     *
     * @see SingletonPattern5#getInstance()
     **/
    @Test
    public void testIsThreadSafe() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                SingletonPattern5 singleton = SingletonPattern5.getInstance();
                System.out.println(singleton);
            });
        }
    }
}
