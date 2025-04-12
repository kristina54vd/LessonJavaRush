package Intefaces;

public class Animal implements Info {
    public int id;
    public Animal(int id) {
        this.id = id;
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }


    @Override// эта анотация обязывает имя нашего метода в класе таким же что и имя в интерфейса
    public void showInfo() {
            System.out.println("Id is" + this.id);
        }


}
