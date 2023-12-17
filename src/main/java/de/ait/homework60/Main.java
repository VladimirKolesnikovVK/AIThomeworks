package de.ait.homework60;

public class Main {
    public static void main(String[] args) {
        Task taskOne = new Task("Первая Задача выполнена.");
        Task taskTwo = new Task("Вторая Задача выполнена.");

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);

        threadOne.start();
        threadTwo.start();

        MyTask myTask = new MyTask();
        Thread threadfirst = new Thread(myTask);
        Thread threadsecond = new Thread(myTask);

        threadfirst.start();
        threadsecond.start();
    }
}
