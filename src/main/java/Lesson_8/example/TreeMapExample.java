package Lesson_8.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Создание сортированного отображения (TreeMap)
        Map<String, Integer> treeMap = new TreeMap<>();

        // Добавление элементов
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Orange", 3);

        // Вывод всех пар ключ-значение (ключи отсортированы)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}

