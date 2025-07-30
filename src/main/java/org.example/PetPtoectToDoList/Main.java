package org.example.PetPtoectToDoList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Отметить как выполненную");
            System.out.println("4. Удалить задачу");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите задачу: ");
                    String taskName = scanner.nextLine();
                    toDoList.addTask(taskName);
                    break;
                case 2:
                    toDoList.showTasks();
                    break;
                case 3:
                    System.out.print("Введите номер задачи: ");
                    int doneIndex = scanner.nextInt() - 1;
                    toDoList.markAsDone(doneIndex);
                    break;
                case 4:
                    System.out.print("Введите номер задачи: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Выход...");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор!");
            }
        }

    }
}
