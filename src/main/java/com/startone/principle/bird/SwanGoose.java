package com.startone.principle.bird;

import com.startone.principle.bird.skill.*;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 21:54
 */
public class SwanGoose extends Bird implements IFly {

    private final Flier flier;

    public SwanGoose() {
        super("SwanGoose");
        flier = new Flier();
    }

    @Override
    public String flying() {
        return flier.flying();
    }

}
