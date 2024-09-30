package Lesson_8.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Создание очереди
        Queue<String> queue = new LinkedList<>();

        // Добавление элементов в очередь
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Извлечение и удаление элемента из очереди
        System.out.println("Первый элемент: " + queue.poll());

        // Просмотр следующего элемента без удаления
        System.out.println("Следующий элемент: " + queue.peek());

        // Вывод всей очереди
        System.out.println("Очередь: " + queue);
    }
}
