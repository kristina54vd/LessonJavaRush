package org.example.kris;

public class CycleFor {

    public static void main(String[] args) {
        for(int i = 10; i>=1;i--) {
            int count = 10 - i;
            for (int j = 0; j < count; j++)
                System.out.print(8);
            System.out.println();
        }

    }
}