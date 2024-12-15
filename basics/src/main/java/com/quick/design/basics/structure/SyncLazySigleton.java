package com.quick.design.basics.structure;

/**
 * @Author vic
 * @Date 2024/12/15 19:45
 * @Description 线程安全的饿汉式单例模式
 */
public class SyncLazySigleton {

    private static SyncLazySigleton INSTANCE;

    private SyncLazySigleton() {}

    public static synchronized SyncLazySigleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SyncLazySigleton();
        }
        return INSTANCE;
    }

}
