package org.example.kris;

public class operatorBreak {//оператор Break - используется для выхода из цикла,если мы его вызываем внутри цикла он немедленно его обрывает
    public static void main(String[] args) {
        int i = 0;
        while (true) {//этот цикл всегда true - будет крутиться бесконечно(While цикл)
            if (i == 15) {//когда i==0 , цикл завершится, break находится в теле if(логическая конструкция)
                ;
                break;
            }
            System.out.println(i);
            i++; // задаем условие если i=0, то к ней прибаляется 1-он крутится бесконечно.
        }
        System.out.println("Выход из цикла");
        }

    }

