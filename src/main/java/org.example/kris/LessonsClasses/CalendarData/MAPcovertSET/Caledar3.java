package org.example.kris.LessonsClasses.CalendarData.MAPcovertSET;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Caledar3 {
    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 2);
            System.out.print(".");
        }
        System.out.print("Финиш");
    }
}
