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
        return "I'm eating";
    }

    public String walking() {
        return "I'm walking";
    }

    public String performing(){
        return "I'm performing";
    }

    public String flying() {
        return "I'm flying";
    }

    public String swimming() {
        return "I'm swimming";
    }
    public String action(String action) {
        switch (action) {
            case "eating":
                return eating();
            case "walking":
                return walking();
            case "performing":
                return performing();
            case "flying":
                return flying();
            case "swimming":
                return swimming();
        }
        return "unknown";
    }

    public String getName() {
        return name;
    }
}
