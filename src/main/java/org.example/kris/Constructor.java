package org.example.kris;

public class Constructor {// Конструктор вызывается при создании нового объекта
    public static void main(String[] args) {
        Girl girl = new Girl();

    }
}
class Girl{
    public Girl() {//Пустой конструктор.Отличается т обычного метода тем что у него не ттипа возвраащемого значения( getter)
                    //имя констурктора всегда дожно совпадать с названием класса
        //System.out.println("Привет из 1 конструктора");
        this.name= "Имя по умолчанию";
        this.age= 0;

    }
    public Girl(String name) {
        System.out.println("Привет из 2 констурктора ");
        this.name = name;//перегрузка методов : если мы передаем параметр строковый ( String) то она передает его
                        //если мы не передаем никаких параметров оставяем пустые скобки ,то она не передает ничего и передает параметры из др конструктора
    }
    public Girl(String name, int age) {
        System.out.println("Привет из 3 конструктора");
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

    public void setAge(int age) {this.age = age;
    }
    public void setName(String name) {this.name = name;

    }
}