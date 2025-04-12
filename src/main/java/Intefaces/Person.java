package Intefaces;

public class Person implements Info{//Person(класс) должет реализовывать методо showInfo в инферфейсе Info
    String name;
    public Person(String name) {
        this.name = name;

    }
    public void  sayHello() {
        System.out.println("Hello");
    }
    public void showInfo (){//этот метод реализут метод интерфейса
        System.out.println("Его зовут " + this.name);
    }
}
