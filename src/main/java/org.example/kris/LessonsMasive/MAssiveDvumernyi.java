package org.example.kris.LessonsMasive;

public class MAssiveDvumernyi {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {


        for (int i = 0; i < result.length; i++) {//Внешний цикл по строкам массива — перебирает строки массива.

            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {//Внутренний цикл по ячейкам — перебирает ячейки одной строки
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }

}