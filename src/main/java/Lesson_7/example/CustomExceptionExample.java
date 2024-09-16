package Lesson_7.example;

// Пользовательское исключение
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // Проверка возраста
        } catch (MyCustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

    // Метод для проверки возраста
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Возраст меньше 18 лет. Доступ запрещён.");
        } else {
            System.out.println("Добро пожаловать!");
        }
    }
}

