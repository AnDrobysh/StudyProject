package Lesson_8.example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Создание множества
        Set<String> set = new HashSet<>();

        // Добавление элементов (дубликаты не будут добавлены)
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Этот элемент не добавится

        // Вывод всех элементов множества
        System.out.println("Множество: " + set);

        // Проверка наличия элемента
        if (set.contains("Banana")) {
            System.out.println("Множество содержит Banana");
        }

        // Удаление элемента
        set.remove("Orange");
        System.out.println("После удаления Orange: " + set);
    }
}

