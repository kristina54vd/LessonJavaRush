package org.example.kris;

public class Massive3 {
    public static void main(String[] args) {
        //МНОГОМЕРНЫЕ МАССИВЫ
        //Одномерные массивы ( int[] x ={1,2,3}; - мы можем обратитсяк каждому элементу массива , задавая инекс.Индекс= челое число
        //Многомерные массивы  представляет из себя матрицу/таблицу чисел
        // /**
        //*1,2,3,5,6,7, - последовательность числе - это одномерный массив.Достаточно 1 числа чтоыб обратиться к массиву
        // *- строка 0
        // *323 ( строка 1)- какая то матрица чисел.1 число - номер строки 2 число номер столбца/На пересечении находится нужное число
        // Т.к нам нужно число 2 ,оно находится в cтроке под индексом 1 ,и в стробце под идексом 1/потому что отсчет идет с 0
        // *323 [1][1]
        // */
        int[][] xaxa ={{1,3,4},
                {1,7,3},
                {6,7,17}};



        //ВЫВОД ДВУМЕРНОГО МАСИВА НА ЭКРАН
        //В ВИДЕ КВАДРАТНОГО МАССИВА- внешиний цикл по строкам , внутренний по столбцам( ПО КАЖДОМУ ЭЛЕМЕНТУ СТРОКИ)
        for (int[] ints : xaxa) {//for ( int i= 0 ; i < xaxa.length; i++){- либо так
            //Внешний цикл//length =3 , потому что кажный элемент многомерного массива это одномерный массив а их 3!
            for (int j = 0; j < ints.length; j++) {//xaxa[i].length- обращаемся к одной из его строк и запрашиваем ее длинну
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }


    }}

