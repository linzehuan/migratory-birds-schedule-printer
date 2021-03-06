package com.startone.principle.bird;

import com.startone.principle.bird.skill.*;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 22:27
 */
public class WildGoose extends Bird implements ISwim, IFly, IProgram {

    private final Swimmer swimmer;
    private final Flier flier;
    private final Programer programer;

    public WildGoose() {
        super("WildGoose");
        swimmer = new Swimmer();
        flier = new Flier();
        programer = new Programer();
    }
    @Override
    public String swimming() {
        return swimmer.swimming();
    }

    @Override
    public String flying() {
        return flier.flying();
    }

    @Override
    public String programing() {
        return programer.programing();
    }
}
