package org.example.kris.Cicles;

import java.util.Arrays;

public class BinarySearch {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 10;

    public static void main(String[] args) {
        Arrays.sort(array);
        boolean arratFound = Arrays.binarySearch(array, element) >= 0;
        if(true){
            System.out.println(arratFound);
        }else{

        }
    }
}
