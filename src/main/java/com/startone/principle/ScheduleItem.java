package com.startone.principle;

/**
 * @author Lin Zehuan
 * @description
 * @email lzh@kapark.cn
 * @date 2020-02-27 21:59
 */
public class ScheduleItem {

    private String time;
    private String action;

    public ScheduleItem(String time, String action) {

        this.time = time;
        this.action = action;
    }

    public String getTime() {
        return time;
    }

    public String getAction() {
        return action;
    }

}
