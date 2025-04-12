package org.example.kris.LessonsObject;

public class Dog extends Animal {
    public void eat(){
        System.out.println("Собака ест");
    }
    public void bark (){
        System.out.println("Собака лает");
    }
    public void showName(){
        System.out.println(name);
    }
    //extends -расширяет, т.е собака наследуется классом Animal

}
