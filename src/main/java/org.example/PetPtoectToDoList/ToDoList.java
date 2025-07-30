package org.example.PetPtoectToDoList;

import java.util.ArrayList;

class ToDoList {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String name) {
        tasks.add(new Task(name));
        System.out.println("Задача добавлена!");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).isDone = true;
            System.out.println("Задача выполнена!");
        } else {
            System.out.println("Неверный номер задачи.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Задача удалена.");
        } else {
            System.out.println("Неверный номер задачи.");
        }
    }
}
