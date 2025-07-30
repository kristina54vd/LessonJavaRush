package org.example.kris.LessonsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMap1 {
    public static Map<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        Set<Map.Entry<String, Double>> studentInfo = grades.entrySet();
        for(Map.Entry<String , Double> indes : studentInfo){
            String key = indes.getKey();
            Double value  = indes.getValue();
            System.out.println(key + " --> " + value);
        }
        //напишите тут ваш код
    }
}

