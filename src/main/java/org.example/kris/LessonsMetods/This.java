package org.example.kris.LessonsMetods;

public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Лиам");
        human1.setAge(3);
        human1.getInfo();
        Human human2 = new Human();
        human2.setName("Саймон");
        human2.setAge(4);
        human2.getInfo();
    }

}
class Human {
    String name;
    int age;
    public void setName(String name) {
        this.name = name;//this - указывает,вызывает объект внутри класса //используется в контектсте Setter
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println(name+" "+age);
    }
}