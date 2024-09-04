package Lesson_1.exercises;

/*В программе необходимо определить, введен ли правильный пароль, но код не работает корректно. Найдите и исправьте ошибку.
Исправьте ошибку в коде, чтобы программа корректно проверяла введенный пароль.
Подсказка: Строки в Java сравниваются с использованием метода equals(), а не оператора ==.*/

public class Exercise_2 {
    public static void main(String[] args) {
        String correctPassword = "JavaRocks";
        String userPassword = "javarocks";

        if (userPassword.equals(correctPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
