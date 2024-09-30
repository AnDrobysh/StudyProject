package Lesson_8.example;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Создание списка
        List<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Получение элемента по индексу
        System.out.println("Первый элемент: " + list.get(0));

        // Изменение элемента
        list.set(1, "Grape");
        System.out.println("Измененный список: " + list);

        // Удаление элемента по индексу
        list.remove(2);
        System.out.println("После удаления: " + list);

        // Перебор элементов списка
        for (String item : list) {
            System.out.println("Элемент: " + item);
        }
    }
}

