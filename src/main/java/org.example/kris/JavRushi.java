package org.example.kris;

import java.util.Arrays;
import java.util.Scanner;

public class JavRushi {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;




    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [10];
        for( int i = 0 ;i < 10; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }
}


