package com.crazybiltz.design.pattern.singleton.tow.check;

import com.carzyblitz.design.pattern.singleton.lazy.SingletonPattern3;
import com.carzyblitz.design.pattern.singleton.tow.check.SingletonPattern4;
import com.carzyblitz.design.pattern.singleton.utils.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * @author liuenyuan
 * @see com.carzyblitz.design.pattern.singleton.tow.check.SingletonPattern4
 **/
public class SingletonPattern4Test {

    /**
     * 测试单例模式之双重检锁模式线程安全性
     *
     * @see SingletonPattern4#getInstance()
     **/
    @Test
    public void testIsThreadSafe1() {
        ExecutorService executorService = ThreadPoolExecutorUtils.getThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                SingletonPattern4 singleton = SingletonPattern4.getInstance();
                System.out.println(singleton);
            });
        }
    }
}
