package com.crazybiltz.design.pattern.singleton.lazy;

import com.carzyblitz.design.pattern.singleton.lazy.SingletonPattern2;
import com.carzyblitz.design.pattern.singleton.utils.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * 单例模式之懒汉模式
 *
 * @see SingletonPattern2
 **/
public class SingletonPattern2Test {

    /**
     * 测试单例模式之懒汉模式线程安全性
     **/
    @Test
    public void testIsThreadSafe() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                SingletonPattern2 singleton = SingletonPattern2.getInstance();
                System.out.println(singleton);
            });
        }
    }
}
