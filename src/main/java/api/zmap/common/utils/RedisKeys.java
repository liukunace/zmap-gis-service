/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.common.utils;

/**
 * Redis所有Keys
 *
 * @author lewkace@gmail.com
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
