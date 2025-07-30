package org.example.kris.LessonsClasses.CalendarData.MAPcovertSET;

import java.time.LocalTime;

public class LocalTime2 {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1  = LocalTime.of(14,00);
    static LocalTime time2 = LocalTime.of(7 , 00 ,8);
    static LocalTime time3 = LocalTime.of(0 , 45 ,0 ,61);
    static LocalTime time4 = LocalTime.of(14 , 0 ,45 , 1001);

    public static void main(String[] args) {
        System.out.println(timeMax);
        System.out.println(timeMin);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);

        //напишите тут ваш код
    }
}
