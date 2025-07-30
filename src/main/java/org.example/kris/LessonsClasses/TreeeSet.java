package org.example.kris.LessonsClasses;

import java.time.*;
import java.util.Set;
import java.util.TreeSet;

public class TreeeSet {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> alsoZone = new TreeSet<>(allZoneIds);


        //напишите тут ваш код

        return alsoZone;
    }

    static ZonedDateTime getBeijingDateTime() {
       ZoneId zonedDateTime = ZoneId.of("Asia/Shanghai");
       ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zonedDateTime);

        //напишите тут ваш код

        return zonedDateTime1;
    }
}
