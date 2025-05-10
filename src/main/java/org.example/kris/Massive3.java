package org.example.kris;

import java.util.Scanner;

public class Massive3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n%2 != 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                System.out.println(array[i]);
            }
        } else if (n%2 == 0) {
            int[] arrays = new int[n];

            for (int j = 0; j < n; j++) {
                arrays[j] = scanner.nextInt();

            }
            for(int d = arrays.length -1 ;d >= 0;d--){
                System.out.println(arrays[d]);

            }


        }

    }
}




