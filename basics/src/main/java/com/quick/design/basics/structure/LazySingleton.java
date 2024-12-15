package com.quick.design.basics.structure;

/**
 * @Author vic
 * @Date 2024/12/15 19:42
 * @Description 懒汉式单例模式
 * <p>
 *     特点：
 *          1、被访问时才加载，节省内存
 *          2、非线程安全，需要增加“同步”机制
*      适用场景：
 *          1、单线程环境
 * </p>
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
