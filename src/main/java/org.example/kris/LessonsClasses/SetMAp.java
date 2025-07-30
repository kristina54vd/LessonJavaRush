package org.example.kris.LessonsClasses;

import java.util.Set;

public class SetMAp {
    public static void main(String[] args) {
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5);
//        boolean contains = integers.contains(4);
//        if (contains = true){
//            System.out.println("4");
//        }

        Integer element = findElement(integers, 4);
        System.out.println(element);

    }

    public static Integer findElement(Set<Integer> integers, Integer i) {
//        for(Integer ok : integers){
//            if(ok.equals(i)){
//
//                return ok;
//            }
//
//
//        }

        return integers.contains(i) ? i : null;

    }




}

