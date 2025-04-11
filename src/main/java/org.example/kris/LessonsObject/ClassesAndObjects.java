package org.example.kris.LessonsObject;



public class ClassesAndObjects {// пустой публичный класс//главный //имя должно соответвовать имети java файла
//можем создать любое кол-во классов
//class gay{}//вспомогательные классы //Различия : Публичный только один ,вспомогательные 1
    public static void main(String[] args) {//Класс это шаблон( Человек ) ,Объект - кокретный человек
        Gay gay1 = new Gay();//Класс можно рассмтаривать тип данных который мы сами создали.Тип данных Gay ( переменная тип Gay -gay1) ссылаем на новы объект класса Gay
        gay1.name = "Alexander";
        gay1.age = 25 ;
        gay1.posivnoi="Поглотитель гречки";
        gay1.sayMyName();
        gay1.gayCalculatot();

        Gay gay2 = new Gay();
        gay2.name = "Uriy";
        gay2.age = 45;
        gay2.posivnoi = "Отец";
        gay2.speak();
        gay2.gayCalculatot();
        int year1 = gay1.gayCalculatot();
        int year2= gay2.gayCalculatot();
        System.out.println(gay1.name + " стал геем " + year1 + " лет назад");
        System.out.println(gay2.name + " стал геем " + year2 + " лет назад");

    }

}
class Gay{
    // у класса могут быть 1.Данные(Поля) 3.Действия(методы) которые он выполянет
 String name;
    int age ;// если зк
    String posivnoi;


        void speak() {//у каждого объекта класса Gay есть метод void//НА ЭТОМ МЕСТЕ ТИП ВОЗВРАЩАЕМОГО ЗНАЧЕНИ
            // void -метод выполняет определенные действия, но не возвращает результат, который можно было бы использовать в дальнейшем в программе.
            //for(int i = 0; i<3; i++)
            System.out.println("Меня зовут " + name + " мне " + age + " обычно меня зовут " + posivnoi);

        }
        void sayMyName(){
        System.out.println("Меня зовут: " + name);
    }
    public int gayCalculatot() {
        int years = age -20;//параметр метода
        return years;// возвращает значение и выходит из метода .Идет последним в методе в данном методе из years  возвращает в int
    }
}
