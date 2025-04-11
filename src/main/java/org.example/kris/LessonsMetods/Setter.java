package org.example.kris.LessonsMetods;

public class Setter {
    public static void main(String[] args) {
        Cat person = new Cat();
        person.setName("");
        person.setAge(-6);
        System.out.println("Выводим значение в main методе: " + person.getName());
        System.out.println("Выводим значение в maim методе: " +person.getAge());//ПЛЮСЫ : внутри класса мы можем изменить имя и это останется незамеченным пользавателем

        person.speak();
    }

}
class Cat {
    private String name;//
    private int age ;


    public void setName(String userName){// SETTER- (Устанавливает значение приватного поля..)в settere  инкапсулируем нужную логику которая проверит корректность ввода
        if (userName.isEmpty()){//Зачем нужен:/Запись значения в поле с проверками/валидацией./Контроль за изменением состояния объекта.
            System.out.println("ты ввел пустое имя ");// возвращает true  если строка пустая, возващает falsue если строка не пустая
        }else{
        name = userName;}
    }
    public String getName(){// GETTER-Возвращает значение приватного поля.Нужен для : чтения поля вне класса ,возможность добавить логику перед возвратом значения (например, форматирование).
        return name;
    }
public void setAge(int userAge){
        if(userAge < 0){
            System.out.println("Ты ввел неправильный возраст");
        }else{
        age = userAge;}
}
public int getAge(){
        return age;
}

    void speak() {
        System.out.println("Меня зовут " + name + " мне " + age + " обычно меня зовут " );

    }
    void sayMyName(){
        System.out.println("Меня зовут: " + name);
    }
    public int gayCalculatot() {
        int years = age - 20;
        return years;
    }
}




