package com.quick.design.basics.structure;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * @Author vic
 * @Date 2024/12/15 20:18
 * @Description todo
 */
public class HungrySingletonTest {

    @Test
    public void test() throws Exception {
        final Field[] declaredFields = HungrySingleton.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            field.set(null, null);
        }
        HungrySingleton instance = HungrySingleton.getInstance();
    }

}