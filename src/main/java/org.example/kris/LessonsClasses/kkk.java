package org.example.kris.LessonsClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class kkk {
    static DateTimeFormatter dateTimeFormatter;
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(timeString,dateTimeFormatter);

        System.out.println(dateTime);
    }
}
