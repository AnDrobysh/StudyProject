package Lesson_8.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Создание отображения (Map)
        Map<String, Integer> map = new HashMap<>();

        // Добавление пар ключ-значение
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Получение значения по ключу
        System.out.println("Значение для ключа Apple: " + map.get("Apple"));

        // Удаление элемента по ключу
        map.remove("Banana");
        System.out.println("После удаления Banana: " + map);

        // Перебор всех пар ключ-значение
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}

