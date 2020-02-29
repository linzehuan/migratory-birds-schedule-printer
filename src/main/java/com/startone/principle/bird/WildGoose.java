package com.startone.principle.bird;

import com.startone.principle.bird.skill.Flier;
import com.startone.principle.bird.skill.IFly;
import com.startone.principle.bird.skill.ISwim;
import com.startone.principle.bird.skill.Swimmer;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 22:27
 */
public class WildGoose extends Bird implements ISwim, IFly {

    private final Swimmer swimmer;
    private final Flier flier;

    public WildGoose() {
        super("WildGoose");
        swimmer = new Swimmer();
        flier = new Flier();

    }
    @Override
    public String swimming() {
        return swimmer.swimming();
    }

    @Override
    public String flying() {
        return flier.flying();
    }
}
