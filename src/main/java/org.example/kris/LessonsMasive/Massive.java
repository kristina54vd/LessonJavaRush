package org.example.kris.LessonsMasive;

public class Massive   {// массив это ссылочный тип данных
    public static void main(String[] args) {
        int [] massive = new int [100];// перемнную ссылаем на новый объект класса  целочисленный массив размером 100// ссылается на этот объект
        //System.out.println(massive[]);// образаемся к ячейке массива по индексу. Массив ведет счет с 0 \ 0 1 2 3 4 => 99 =размер массива
       for (int i = 0; i < massive.length; i++){// i инкрементируется ( повторятеся цикл ) пока оyа меньше длинны массива (length)
           massive[i] = i*10;// здесь мы обращаемся к каждому элементу от 0 до 99 и помещаем в них какое то значение| допустим если i
           //равно 0 это меньше 99 ,прибавляем 1 : i=1, значит мы приваеваем ему значение i*10= 10 ,и так далее пока ш стане равным 99
           //System.out.println(massive[i]);// вывод значение  переменной массива
       }
       for( int i = 0;i<massive.length;i++){//вывод массива на экран
           System.out.println(massive[i]);
       }
    int [] massive2 =  {1,2,3,4,5,6,7,8,9,10};//при указании содержимого массива {}//массив с заранее помещенными элементами
       for (int i = 0; i < massive2.length; i++){//тут отчет будет от 1 значения содержимого массива т.е от 1
           System.out.println(massive2[i]);//на выходе все содержимое массива
       }
    }

}
