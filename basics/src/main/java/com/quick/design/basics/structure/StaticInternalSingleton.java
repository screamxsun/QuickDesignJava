package com.quick.design.basics.structure;

/**
 * @Author vic
 * @Date 2024/12/15 20:05
 * @Description 静态内部类单例模式
 * 特点：
 * 	•	利用 JVM 类加载机制，线程安全且延迟加载。
 * 	•	不需要显式同步，效率高。
 * 适用场景：
 *  •	推荐使用的实现方式，简洁且高效。
 */
public class StaticInternalSingleton {

    private StaticInternalSingleton() {}

    /**
     * Java 的 类加载机制 保证了类初始化的线程安全。在多线程环境下，如果多个线程同时调用 getInstance() 方法，只有 一个线程 会成功加载 Holder 类并初始化 INSTANCE，其他线程则直接访问已经初始化的实例。这是 JVM 在加载类时的特性，所以静态内部类单例模式天生具有线程安全性。
     *
     * @return
     */
    public static StaticInternalSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final StaticInternalSingleton INSTANCE = new StaticInternalSingleton();
    }
}
