package com.startone.principle;

import com.google.common.collect.Lists;
import com.startone.principle.bird.Bird;
import com.startone.principle.bird.Penguin;
import com.startone.principle.bird.SwanGoose;
import com.startone.principle.bird.WildGoose;
import com.startone.principle.bird.Sallow;
import com.startone.principle.format.TextFormatter;
import org.junit.Test;

import java.util.List;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-29 21:28
 */

public class BirdsSchedulePrinterTest {

    @Test
    public void should_return_schedule() {
        String expectShedule = "7:00,WildGoose,I'm eating\n" +
                "7:00,SwanGoose,I'm eating\n" +
                "7:00,Penguin,I'm eating\n" +
                "7:00,Sallow,I'm eating\n" +
                "8:00,WildGoose,I'm walking\n" +
                "8:00,SwanGoose,I'm walking\n" +
                "8:00,Penguin,I'm walking\n" +
                "8:00,Sallow,I'm walking\n" +
                "9:00,WildGoose,I'm performing\n" +
                "9:00,SwanGoose,I'm performing\n" +
                "9:00,Penguin,I'm performing\n" +
                "9:00,Sallow,I'm performing\n" +
                "10:00,WildGoose,I'm flying\n" +
                "10:00,SwanGoose,I'm flying\n" +
                "10:00,Sallow,I'm flying\n" +
                "11:00,WildGoose,I'm swimming\n" +
                "11:00,Penguin,I'm swimming\n" +
                "13:00,WildGoose,I'm programing\n" +
                "13:00,Sallow,I'm programing\n" +
                "14:00,Penguin,I'm building\n" +
                ""
                ;

        List<ScheduleItem> schedule = Lists.newArrayList(
                new ScheduleItem("7:00", "eating"),
                new ScheduleItem("8:00", "walking"),
                new ScheduleItem("9:00", "performing"),
                new ScheduleItem("10:00", "flying"),
                new ScheduleItem("11:00", "swimming"),
                new ScheduleItem("13:00", "programing"),
                new ScheduleItem("14:00", "building")
        );
        List<Bird> birds = Lists.newArrayList(new WildGoose(), new SwanGoose(), new Penguin(),new Sallow());

        BirdsSchedulePrinter birdsSchedulePrinter = new BirdsSchedulePrinter(schedule, birds, new TextFormatter());
        birdsSchedulePrinter.print();

        assertThat(birdsSchedulePrinter.getMessage(), is(expectShedule));
    }
}


