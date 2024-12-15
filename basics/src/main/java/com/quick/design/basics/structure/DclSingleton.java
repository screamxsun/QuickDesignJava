package com.quick.design.basics.structure;


/**
 * @Author vic
 * @Date 2024/12/15 19:50
 * @Description 双重锁校验单例模式
 */
public class DclSingleton {

    /**
     * 指令重排的问题
     *
     * 在 Java 中，对象的实例化可以分为以下三个步骤：
     * 	1.	分配内存：为对象分配内存空间。
     * 	2.	初始化对象：调用构造方法，执行对象初始化。
     * 	3.	设置引用：将对象的内存地址赋值给引用变量。
     *
     * 但是，编译器和处理器可能会进行指令重排，从而改变步骤的执行顺序。例如，可能会发生以下情况：
     * 	1.	分配内存。
     * 	2.	设置引用（对象的内存地址被分配给变量）。
     * 	3.	初始化对象。
     *
     * 这种重排不会影响单线程的正确性，因为在单线程中，不会在完成初始化之前访问对象。
     * 但在多线程环境下，这种重排可能会导致线程获取到一个未完全初始化的对象。
     */
    private volatile static DclSingleton INSTANCE;

    private DclSingleton() {}

    public static DclSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
