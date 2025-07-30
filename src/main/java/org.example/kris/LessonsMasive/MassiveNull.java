package org.example.kris.LessonsMasive;

import java.util.Arrays;

public class MassiveNull {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length] ;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[j] = temp[i];
                j++;
            }
        }
    }
}
