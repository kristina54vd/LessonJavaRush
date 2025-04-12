package org.example.kris.LessonsMetods;

import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String militaryCommissar = ", явитесь в военкомат";
        System.out.println("Введите возраст и имя");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();

        if((age >= 18) && (age <=28)){
            System.out.println(name + militaryCommissar);
        }


    }

}
