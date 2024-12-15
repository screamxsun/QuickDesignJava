package com.quick.design.basics.structure;

/**
 * @Author vic
 * @Date 2024/12/15 19:34
 * @Description 饿汉式单例模式
 * <p>
 *     特点：
 *          1、类加载时就创建实例，无需加锁，线程安全。
 *          2、即使没有被使用，实例也会被创建。
 *     适用场景：
 *          1、对象较小
 * </p>
 */
public class HungrySingleton {

    private static HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 单例模式不能被外部实例化
     */
    private HungrySingleton() {
        if (INSTANCE != null) {
            throw new RuntimeException();
        }
    }

    /**
     * 提供唯一入口访问唯一的实例对象
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}
