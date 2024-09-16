package Lesson_7.example;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!"); // Обработка исключения
        } finally {
            System.out.println("Этот блок выполнится всегда."); // Выполнится в любом случае
        }
    }
}

