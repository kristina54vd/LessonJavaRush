package org.example.kris.LessonsClasses.CalendarData.MAPcovertSET;

import java.time.LocalDate;
import java.time.Month;

public class LocalDaate {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate dateNow = LocalDate.now();

        //напишите тут ваш код

        return dateNow;
    }

    static LocalDate ofExample() {
        LocalDate nowExaple = LocalDate.of(2025 , Month.SEPTEMBER , 24);
        //напишите тут ваш код

        return nowExaple;
    }

    static LocalDate ofYearDayExample() {
        LocalDate yearOfExample = LocalDate.ofYearDay(2025 ,  4);
        //напишите тут ваш код;

        return yearOfExample;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate epochDay = LocalDate.ofEpochDay(365);
        //напишите тут ваш код

        return epochDay;
    }
}


