package org.example;

import java.util.Scanner;

public class JavaRuch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int min = Integer.MIN_VALUE ;
        while( scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if(x < min );
            min = x;

        }
        System.out.println(min);
    }
}
