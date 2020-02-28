package com.startone.principle;

import com.google.common.collect.Lists;
import com.startone.principle.bird.Bird;
import com.startone.principle.bird.SwanGoose;
import com.startone.principle.bird.WildGoose;
import com.startone.principle.format.TextFormatter;

import java.util.List;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 21:42
 */
public class Application {

    public static void main(String[] args) {

        List<ScheduleItem> schedule = Lists.newArrayList(
                new ScheduleItem("7:00", "eating"),
                new ScheduleItem("8:00", "walking"),
                new ScheduleItem("9:00", "performing"),
                new ScheduleItem("10:00", "flying"),
                new ScheduleItem("11:00", "swimming")
        );
        List<Bird> birds = Lists.newArrayList(new WildGoose(), new SwanGoose(),new Penguin());

        BirdsSchedulePrinter birdsSchedulePrinter = new BirdsSchedulePrinter(schedule, birds, new TextFormatter());
        birdsSchedulePrinter.print();

    }
}
