package com.startone.principle;

import com.google.common.collect.Lists;
import com.startone.principle.bird.Bird;
import com.startone.principle.bird.SwanGoose;
import com.startone.principle.bird.WildGoose;
import com.startone.principle.format.Formatter;
import com.startone.principle.format.TextFormatter;

import java.util.*;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 21:56
 */
public class BirdsSchedulePrinter {

    public List<ScheduleItem> schedule;
    private List<Bird> birds;


    public BirdsSchedulePrinter(List<ScheduleItem> schedule, List<Bird> birds, Formatter formatter) {
        this.schedule = schedule;
        this.birds = birds;
        this.formatter = formatter;
    }

    private Formatter formatter;

    private String message;

    public void print() {

        StringBuilder formatMessage = new StringBuilder();


        schedule.forEach(scheduleItem -> {
            birds.forEach(bird -> {
                switch (scheduleItem.getAction()){
                    case "walking": break;
                    case "eating": break;
                    case "performing":break;
                    case "flying": if(bird instanceof Penguin){return;}break;
                    case "swimming":if(bird instanceof SwanGoose){return;}break;
                }
                formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), bird.action(scheduleItem.getAction())));

            });
        });
        this.message = formatMessage.toString();
        System.out.println(formatMessage);
    }

    public String getMessage() {
        return message;
    }

}
