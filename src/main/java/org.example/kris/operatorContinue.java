package org.example.kris;

public class operatorContinue {
    public static void main(String[] args) {
        for (int i = 0; i<=15;i++){// цикл for 1-инициализация,2 - условия (если i  меньше или равно 15, то выполняем операто  continue), 3-
            if(i%2==0){// это условие если if(логическая конструкция ) 1 % 2(подели на это число которое идет за процентом и посмотри остаток"операто процент" ) = 0 , то мы выполняем соntinue
                continue;//допустимо для всех четных чисел .
            }
            System.out.println("Вы ввели нечетное число" + i);
        }

    }
}
