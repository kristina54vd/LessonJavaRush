package Intefaces;

public class TEst {
    public static void main(String[] args) {
       /* Animal animal1 = new Animal(1);
        Person person1 = new Person("Лиам");
        animal1.showInfo();
        person1.showInfo();

        */
        /*Info info1 = new Animal(1);//переменная типа Info ссылается на объет класса Animal//
        Info info2 = new Person(" Лиам ");//Мы можем так делать только с классамикоторые реализуют этот интерфейс//
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

         */
        Animal animal1 = new Animal(1);
        Person person1 = new Person(" Лиам ");
        outputInfo(animal1);//объекты этих классов реализуют метод outputInfp который реализут интерфейс Info
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();

    }
}
//суть интерфейса:
//Класс может реализовывать любое количество интерфейсов:public interface Info , ,,,,
//Класс может наследовать  только 1 другой класс,он обязан иметь методы которые в этом интерфейсе указаны