package com.diary.lionem.pinit;

import android.graphics.drawable.Drawable;

/**
 * Created by m2j97 on 2018-02-25.
 */

public class ListViewItemListTitle {
    private Drawable picDrawable;
    private String travelTitle;
    private String travelDays;
    private int scheduleNum;

    public void setPicDrawable(Drawable pic){
        picDrawable = pic;
    }

    public void setTravelTitle(String title){
        travelTitle = title;
    }

    public void setTravelDays(String days) { travelDays = days; }

    public void setScheduleNum(int num) { scheduleNum = num; }
}
