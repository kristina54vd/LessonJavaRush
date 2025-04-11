package org.example.kris.LessonsObject;

public class ClassObjectString {
    public static void main(String[] args) {//все клаасы в джава наследуют класс Object
        Cats human= new Cats("Liam",3);
        human.toString();//возвращает HashCode(уникальный номер для каждого объекта) для созданного ообъекта
        //когда мы вызываем метод print  и т,д они всегда вызывают скрыто метод toString
        System.out.println(human);



    }
}
class Cats {//Наследуется от класса Object(мы его не видим ) и наследует его методы и поля
    private String name;
    private int age;

    public Cats (String name, int age) {
        this.name = name;
        this.age = age;
    }
public String toString() {// возващение или представление объекта в виде строки
        return "Cats [name=" + name + ", age=" + age + "]";
}
        }