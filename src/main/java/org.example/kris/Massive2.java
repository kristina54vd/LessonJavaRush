package org.example.kris;

public class Massive2   {
    public static void main(String[] args) {
        int []massive = new int[3];
        massive[0]= 110;
        String [] massive1 = new String[3];//МАССИВ ИЗ СТРОК , состоит из 3 ячеек и каждая может в себя вместить объект класса String
        massive1[0] = "Пока";
        massive1[1]= "неудачники.";
        massive1[2] ="Я ужожу в более перспективную команду";

        for(int i=0;i<massive1.length;i++){
            System.out.println(massive1[i]);
        }
        ///ЦИКЛ FOR EACH:
        for(String string : massive1){//Тип данных String, имя переменной sting :String string это означет что мы хотим внутри этого цикла работать с строкой ее имя string
            // и пишем массив через который хотим проходить
            //этот цикл ссылается на все элементы массива и итерирует их по очереди с выведением на консоль
            System.out.println(string);
        }
        int[]num = {1,2,3,4,5};
        int ok = 0;
        for(int y:num){//у нас есть массив num который содержит чила и sum=0 .
            //в этом цикле for each  мы берем массив num и каждую итерацию подставялем в переменную "у" каждый из этих чисел
            ok=ok+y;//на 1 итерации int y =1 на 2 =2 на 3= 3 и т.д//и каждую итераци цикла переменную ok мы прибавляем к каждому их этих чисел
        }// в итоге СУУММА ВСЕХ ЧИСЕЛ МАССИВА
        System.out.println(ok);

        int value =0 ; //32 бита
        //String s;// выделяется память только под ссылку "S"//"адресс дома"
        //String s= "ffgfg";// выделяется память под строку// "адресс ссылает на этот дом"
        //String s = null; // переменная s  указывает на НИЧТО( null)

    }




}
