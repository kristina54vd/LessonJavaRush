package org.example.kris.LessonsMasive;

public class MassiveReverse {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int rev;
        for (int a = 0; a < array.length/2; a++) {
            rev = array[a];
            array[a] =array[ array.length - 1 - a];
            array[ array.length - 1 - a] = rev;



        }

        }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    //напишите тут ваш код
    }



