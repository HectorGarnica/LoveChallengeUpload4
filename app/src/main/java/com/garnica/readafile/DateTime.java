package com.garnica.readafile;

/**
 * Created by DANY on 7/31/2017.
 */

import java.util.GregorianCalendar;

public class DateTime {
    private int day, month;
    GregorianCalendar date = new GregorianCalendar();

    public DateTime() {
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
        month = date.get(GregorianCalendar.MONTH) + 1;
    }


    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }

}
//This code is from:
//https://stackoverflow.com/questions/24788435/how-can-i-return-int-date-month-year-in-a-single-method