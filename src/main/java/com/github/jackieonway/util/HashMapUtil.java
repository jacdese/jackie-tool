/**
 * Jackie.
 * Copyright (c)) 2019 - 2021 All Right Reserved
 */
package com.github.jackieonway.util;

/**
 * @author Jackie
 * @version $id: HashMapUtil.java v 0.1 2021-01-13 16:47 Jackie Exp $$
 */
public class HashMapUtil {

    private HashMapUtil(){}

    /**
     * generate default capacity for hashMap  to reduce it resize's count
     * @param size data size
     * @return capacity
     */
    public static int generateCapacity(int size){
        int i = (int) ((float) size / 0.75F + 1.0F);
        i |= i >>> 1;
        i |= i >>> 2;
        i |= i >>> 4;
        i |= i >>> 8;
        i |= i >>> 16;
        return i + 1;
    }
}
