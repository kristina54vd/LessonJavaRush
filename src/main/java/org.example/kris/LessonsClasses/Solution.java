package org.example.kris.LessonsClasses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0 , s);

        //напишите тут ваш код
    }

    public String pop() {
        return storage.removeFirst();


    }

    public String peek() {
        return  storage.getFirst();
        //напишите тут ваш код
    }

    public boolean empty() {
        return storage.isEmpty();
        //напишите тут ваш код
    }

    public int search(String s) {
        return storage.indexOf(s);
        //напишите тут ваш код
    }

    }




