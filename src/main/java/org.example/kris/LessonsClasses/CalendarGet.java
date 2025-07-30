package org.example.kris.LessonsClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.JULY;

public class CalendarGet {

        static Calendar birthDate = new GregorianCalendar(1998, JULY, 24);

        public static void main(String[] args) {
            System.out.println(getDayOfWeek(birthDate));
        }

        static String getDayOfWeek(Calendar calendar) {
            Locale russianLocal = new Locale("ru");
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", russianLocal);
            String formattedDate = sdf.format(calendar.getTime());

            return formattedDate;
        }
    }

