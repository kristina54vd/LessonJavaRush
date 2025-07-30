package org.example.kris;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        TimePeriod timePeriod = new TimePeriod("09:00-10:00");
        TimePeriod timePeriod2 = new TimePeriod("10:00-11:00");
        TimePeriod timePeriod3 = new TimePeriod("11:00-12:00");

        List<TimePeriod> timePeriods = List.of(timePeriod, timePeriod2, timePeriod3);

        TimePeriod nextPeriod = TimePeriod.getNextPeriod(timePeriods, timePeriod2);
        System.out.println(timePeriods);
        System.out.println(nextPeriod);



    }
}
