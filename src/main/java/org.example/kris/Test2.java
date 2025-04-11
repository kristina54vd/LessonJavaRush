package org.example.kris;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner user = new Scanner("Листва кружится /n" +
                "Уже не кружится/n "+
                "Голова");
        String frase = user.nextLine();
        System.out.println(frase.toLowerCase() + frase.toLowerCase() + frase);

    }

    }

