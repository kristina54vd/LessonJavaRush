package org.example.kris.Cicles;

public class NewCycl {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "четное");
            }else {
                System.out.println(i + "нечетное");
            }
        }

        System.out.println(getInt(3));

    }//или

    public static String getInt(int i){
        return i % 2 == 0 ? "четное" : "Нечетное";
    }
}
