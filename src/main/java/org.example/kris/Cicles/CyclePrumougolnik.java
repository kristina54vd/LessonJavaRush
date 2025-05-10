package org.example.kris.Cicles;

public class CyclePrumougolnik {
    public static void main(String[] args) {


        int a = 1;
        while (a <= 10) {
            int m = 1;
            while (m <= 20) {
                if (a == 1 || m == 1) {
                    System.out.print('Б');
                } else if (a == 10 || m == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }

                m++;

            }
            System.out.println();
            a++;

        }

        //напишите тут ваш код


    }
}
