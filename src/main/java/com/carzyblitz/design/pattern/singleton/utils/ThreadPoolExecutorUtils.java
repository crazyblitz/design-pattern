package com.carzyblitz.design.pattern.singleton.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 线程池工具类
 *
 * @author liuenyuan
 **/
public class ThreadPoolExecutorUtils {

    private static ThreadFactoryBuilder builder;

    static {
        builder = new ThreadFactoryBuilder();
        builder.setNameFormat("singleton-thread-pool-%d");
    }

    /**
     * thread pool
     **/
    private final static ExecutorService THREAD_POOL = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MICROSECONDS,
            new ArrayBlockingQueue<>(200), builder.build());


    public static ExecutorService getThreadPool() {
        return THREAD_POOL;
    }
}
