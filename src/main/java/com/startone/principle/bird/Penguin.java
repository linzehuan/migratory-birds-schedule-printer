package com.startone.principle.bird;

import com.startone.principle.bird.skill.ISwim;
import com.startone.principle.bird.skill.Swimmer;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-28 21:58
 */
public class Penguin extends Bird implements ISwim {

    private Swimmer swimmer;

    public Penguin() {
        super("Penguin");
        swimmer = new Swimmer();
    }

    @Override
    public String action() {
        return swimmer.action();
    }
}
