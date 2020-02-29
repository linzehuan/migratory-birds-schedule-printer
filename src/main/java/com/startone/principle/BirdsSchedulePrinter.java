package com.startone.principle;

import com.startone.principle.bird.*;
import com.startone.principle.format.Formatter;
import com.startone.principle.bird.skill.IFly;
import com.startone.principle.bird.skill.ISwim;

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
                switch (scheduleItem.getAction()) {
                    case "walking":
                        formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), bird.walking()));
                        break;
                    case "eating":
                        formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), bird.eating()));
                        break;
                    case "performing":
                        formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), bird.performing()));
                        break;
                    case "flying":
                        if (bird instanceof IFly) {
                            formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), ((IFly) bird).flying()));
                            return;
                        }
                        break;
                    case "swimming":
                        if (bird instanceof ISwim) {
                            formatMessage.append(this.formatter.format(scheduleItem.getTime(), bird.getName(), ((ISwim) bird).action()));
                        }
                        break;
                    default:
                }

            });
        });
        this.message = formatMessage.toString();
        System.out.println(formatMessage);
    }

    public String getMessage() {
        return message;
    }

}
