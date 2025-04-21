package org.example.kris;

import java.util.Scanner;

public class doWile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = Math.PI;

        int S = (int) (pi * radius * radius);

        System.out.println(S);

    }


    }

