package org.example.PetPtoectToDoList;

class Task {
    String name;
    boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + name;
    }
}
