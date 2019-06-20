package com.crazybiltz.design.pattern.singleton.hungry;

import com.carzyblitz.design.pattern.singleton.hungry.SingletonPattern1;
import com.carzyblitz.design.pattern.singleton.utils.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * @see SingletonPattern1
 **/
public class SingletonPattern1Test {

    /**
     * 测试单例模式之饿汉模式线程安全性
     **/
    @Test
    public void testIsThreadSafe() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                SingletonPattern1 singleton = SingletonPattern1.getInstance();
                System.out.println(singleton);
            });
        }
    }
}
