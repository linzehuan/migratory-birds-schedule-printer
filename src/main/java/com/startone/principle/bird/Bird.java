package com.startone.principle.bird;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 21:43
 */
public class Bird {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String eating() {
        return "eating";
    }

    public String walking() {
        return "walking";
    }

    public String performing() {
        return "performing";
    }




    public String getName() {
        return name;
    }
}
