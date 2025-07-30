package org.example.kris.LessonsClasses.CalendarData.MAPcovertSET;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DataLocalTime {

    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        int day = dateTime.getDayOfWeek().getValue();
        boolean holidays = false;
         if (day == FRIDAY && dateTime.toLocalTime().isAfter(LocalTime.of(WEEKEND_START_FRIDAY_CUT_OFF_HOUR - 1, 59, 59))) {
            holidays = true;
        }
        else if (day == SATURDAY) {
            holidays = true;
        }
        else if (day == SUNDAY && dateTime.toLocalTime().isBefore(LocalTime.of(WEEKEND_END_SUNDAY_CUT_OFF_HOUR, 0, 0))) {
            holidays = true;
        }
        return holidays;
    }
}
