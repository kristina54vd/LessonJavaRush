package org.example.kris;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TimePeriod {

        private final LocalTime start;
        private final LocalTime end;

        private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

        public TimePeriod(String periodStr) {
            String[] parts = periodStr.split("-");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid period format. Expected HH:mm-HH:mm");
            }
            this.start = LocalTime.parse(parts[0], TIME_FORMATTER);
            this.end = LocalTime.parse(parts[1], TIME_FORMATTER);

            if (!end.isAfter(start)) {
                throw new IllegalArgumentException("End time must be after start time");
            }
        }
        public static TimePeriod getNextPeriod(List<TimePeriod> periods, TimePeriod period) {
            int i = periods.indexOf(period);
            if (i == periods.size() - 1) {
                return periods.getFirst();
            }
            return periods.get(i + 1);

        }
    public String toString() {
        return start.format(TIME_FORMATTER) + "-" + end.format(TIME_FORMATTER);
    }





        }


