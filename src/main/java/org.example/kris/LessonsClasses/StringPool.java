package org.example.kris.LessonsClasses;

public class StringPool {

    public static void main(String[] args) {
            String first = new String("JavaRush");
            String second = new String("JavaRush");
            String third = new String("javarush");
            System.out.println(equal(first, second));
            System.out.println(equal(second, third));
        }

        public static boolean equal(String first, String second) {
            String f = first.intern();
            String s = second.intern();
          
            if(f == s ){
                return true;
            }else{
                return false;
            }
        }
    }



