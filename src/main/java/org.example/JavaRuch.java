package org.example;

import java.util.Scanner;

public class JavaRuch {
    public static void main(String[] args) {
        for (int i = 11; i >= 1; i--) {
            int count = 11 - i;
            for (int j = -1; j < count; j++)
                System.out.print(8);
            System.out.println();
        }
    }
}
