package com.startone.principle.bird;

import com.startone.principle.bird.Bird;
import com.startone.principle.bird.skill.Flier;
import com.startone.principle.bird.skill.IFly;
import com.startone.principle.bird.skill.IProgram;
import com.startone.principle.bird.skill.Programer;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-03-02 20:59
 */
public class Sallow extends Bird implements IFly, IProgram {

    private final Flier flier;
    private final Programer programer;

    public Sallow() {
        super("Sallow");
        flier = new Flier();
        programer = new Programer();
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
