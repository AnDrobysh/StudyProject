package Lesson_7.example;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            methodWithException(); // Вызов метода, который может выбросить исключение
        } catch (IOException e) {
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }

    // Метод, который объявляет, что он может выбросить исключение
    public static void methodWithException() throws IOException {
        throw new IOException("Введена ошибка ввода/вывода.");
    }
}

