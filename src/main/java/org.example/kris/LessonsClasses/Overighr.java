package org.example.kris.LessonsClasses;

public class Overighr {

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }



}

class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this != obj) {

            return false;

        } else if (obj == null || getClass() != obj.getClass()) {// сравниваем из одного ли класса объекты которые не равны null
            return false;
        }
        return false;
    }
}

