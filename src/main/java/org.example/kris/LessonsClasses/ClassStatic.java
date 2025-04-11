package org.example.kris.LessonsClasses;

public class ClassStatic {
    public static void main(String[] args) {

        //статистическую переменную нельзя изменить серез объект chel.description=!| Только через класс
        // Human.description= "Cаймон плохой"
        Chel ch1 = new Chel("Лиам",2);
        Chel ch2 = new Chel("Луис",3);
        ch1.printCountCats();
        ch2.printCountCats();

        /*Chel.description = "Хороший";
        ch1.getAllInfo();
        ch2.getAllInfo();
        Chel.description= " Плохой";
        ch1.getAllInfo();
        ch2.getAllInfo();

        System.out.println(Math.pow(2,4));// возводит число 1 в число 2
        */
    }
}
class Chel {
    private String name;
    private int age;
    private static int CountCats = 0;//ее значение привязано к всему классу
    //public static String description;// переменная общая для всех объектов класса Chel


    public Chel(String name, int age) {
        this.name = name;
        this.age = age;
        CountCats++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void printCountCats( ) {
        System.out.println("Number of Cats: " + CountCats);
   }



}