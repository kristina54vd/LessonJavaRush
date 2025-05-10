package org.example.kris.LessonsMetods;

import java.util.Scanner;

public class PublicCalculatorPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        long valuePow = scanner.nextLong();
        cube(value,valuePow);
    }
    public static void cube(long valu,long valuePo){

        System.out.println(Math.pow(valu,valuePo));


    }


}