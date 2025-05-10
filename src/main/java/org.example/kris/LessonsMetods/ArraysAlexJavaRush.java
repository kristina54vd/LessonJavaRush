package org.example.kris.LessonsMetods;

import java.util.Arrays;

public class ArraysAlexJavaRush {


        public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        public static int[] resultArray ;

        public static void main(String[] args) {
            resultArray = new int[firstArray.length + secondArray.length];
            copy(firstArray, 0, resultArray, 0, firstArray.length);
            copy(secondArray, 0, resultArray, firstArray.length, secondArray.length);

            System.out.println(Arrays.toString(resultArray));
        }

        public static void copy(int[] array, int start, int[] resultArray, int startInResult, int length){
            System.arraycopy(array, start, resultArray, startInResult, length);
        }
}


