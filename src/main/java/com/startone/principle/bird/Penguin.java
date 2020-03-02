package com.startone.principle.bird;

import com.startone.principle.bird.skill.*;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-28 21:58
 */
public class Penguin extends Bird implements ISwim, IBuild {

    private Swimmer swimmer;
    private Builder builder;

    public Penguin() {
        super("Penguin");
        swimmer = new Swimmer();
        builder = new Builder();
    }

    @Override
    public String swimming() {
        return swimmer.swimming();
    }

    @Override
    public String building() {
        return builder.building();
    }
}
