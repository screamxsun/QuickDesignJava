package com.quick.design.basics.structure;

/**
 * @Author vic
 * @Date 2024/12/15 20:12
 * @Description 枚举单例
 * 	特点：
 * 	    使用 enum 实现单例模式，线程安全，防止反射和序列化破坏。
 * 	    实现最简洁，但不能延迟加载实例。
 * 	适用场景：
 * 	    需要极高安全性和简单实现的场景。
 */
public enum EnumSigleton {

    INSTANCE;

    public void doAction() {

    }

}
