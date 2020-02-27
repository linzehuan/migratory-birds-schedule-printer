package com.startone.principle.format;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 22:23
 */
public class TextFormatter implements Formatter {


    @Override
    public String format(String... params) {
        return String.format("%s,%s,%s\n",params);
    }
}
