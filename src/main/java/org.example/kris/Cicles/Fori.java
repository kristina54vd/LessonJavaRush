package org.example.kris.Cicles;

public class Fori {
    public static void main(String[] args) {
        int s = 0;
        for (foo('A'); foo('B') && (s < 2); foo('C')) {//итерация foo('C') в последнюю очередь после инициализации 'D'.Инициализация i=0 (foo'A' только один раз в начале
            s++;
            foo('D');

        }
    }
         public static boolean foo(char a){

            System.out.println(a);
            return true;
        }
    }

